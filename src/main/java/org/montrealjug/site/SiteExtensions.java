package org.montrealjug.site;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import io.quarkiverse.roq.frontmatter.runtime.model.DocumentPage;
import io.quarkiverse.roq.frontmatter.runtime.model.Page;
import io.quarkiverse.roq.frontmatter.runtime.model.RoqCollection;
import io.quarkiverse.roq.frontmatter.runtime.model.Site;
import io.quarkus.qute.TemplateExtension;
import io.vertx.core.json.JsonArray;

/**
 * Jekyll-like helpers: Jekyll had a single `site.posts` list (newest first) across all categories,
 * Roq has one collection per category (meetup, blog).
 */
@TemplateExtension
public class SiteExtensions {

    static final List<String> POST_COLLECTIONS = List.of("meetup", "blog");

    /** Jekyll's {@code site.posts}: all posts, newest first. */
    static List<DocumentPage> posts(Site site) {
        return POST_COLLECTIONS.stream()
                .map(id -> site.collections().get(id))
                .filter(Objects::nonNull)
                .flatMap(RoqCollection::stream)
                .sorted(Comparator.comparing(DocumentPage::date).reversed())
                .toList();
    }

    /** Jekyll's {@code page.next}: the next newer post, across all categories. */
    static DocumentPage newer(Page page) {
        List<DocumentPage> posts = posts(page.site());
        int i = posts.indexOf(page);
        return i > 0 ? posts.get(i - 1) : null;
    }

    /** Jekyll's {@code page.previous}: the next older post, across all categories. */
    static DocumentPage older(Page page) {
        List<DocumentPage> posts = posts(page.site());
        int i = posts.indexOf(page);
        return i >= 0 && i < posts.size() - 1 ? posts.get(i + 1) : null;
    }

    /** Jekyll's {@code date: "%B %d, %Y"} filter, for raw front matter values such as {@code modified}. */
    static String longDate(Object value) {
        String text = String.valueOf(value);
        TemporalAccessor date = text.contains("T")
                ? OffsetDateTime.parse(text, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                : LocalDate.parse(text);
        return DateTimeFormatter.ofPattern("MMMM dd, yyyy", Locale.ENGLISH).format(date);
    }

    /** Jekyll's {@code site.tags}: tag name to posts, sorted by tag name. */
    static Map<String, List<DocumentPage>> tags(Site site) {
        Map<String, List<DocumentPage>> tags = new TreeMap<>();
        for (DocumentPage post : posts(site)) {
            if (post.data().getValue("tags") instanceof JsonArray postTags) {
                for (Object tag : postTags) {
                    tags.computeIfAbsent(String.valueOf(tag), t -> new ArrayList<>()).add(post);
                }
            }
        }
        return tags;
    }
}
