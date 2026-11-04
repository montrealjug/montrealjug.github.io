---
layout: page
title: Tag Index
excerpt: "An archive of posts sorted by tag."
---

<ul class="tag-box inline">
  {#for tag in site.tags}
    <li><a href="#{tag.key}">{tag.key} <span>{tag.value.size}</span></a></li>
  {/for}
</ul>

{#for tag in site.tags}
  <h2 id="{tag.key}">{tag.key}</h2>
  <ul class="post-list">
  {#for post in tag.value}{#if post.title??}
    <li><a href="{post.url.absolute}">{post.title.raw}<span class="entry-date"><time datetime="{post.date.format("yyyy-MM-dd'T'HH:mm:ssXXX")}">{post.date.format('MMMM dd, yyyy')}</time></span></a></li>
  {/if}{/for}
  </ul>
{/for}
