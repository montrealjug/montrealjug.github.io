---
layout: page
title: Annonces
excerpt: "Toutes les annonces du Montréal JUG"
---

<ul class="post-list">
{#for post in site.collections.blog}
  <li><article><a href="{post.url.absolute}">{post.title.raw} <span class="entry-date"><time datetime="{post.date.format("yyyy-MM-dd'T'HH:mm:ssXXX")}">{post.date.format('MMMM dd, yyyy')}</time></span></a></article></li>
{/for}
</ul>
