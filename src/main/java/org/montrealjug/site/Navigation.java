package org.montrealjug.site;

import java.util.List;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

/** Typed mapping of data/navigation.yml, exposed to templates as {@code cdi:navigation}. */
@DataMapping(value = "navigation", type = DataMapping.Type.ARRAY_FILE)
public record Navigation(List<Link> list) {

    public record Link(String title, String url) {
    }
}
