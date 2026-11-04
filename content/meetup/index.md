---
layout: page
title: Meetups
excerpt: "Tous les Meetups du Montréal JUG"
---

<ul class="post-list">
{#for post in site.collections.meetup}
 {#if !post.data.hidden??}
  <li><article><a href="{post.url.absolute}">{post.title.raw} <span class="entry-date"><time datetime="{post.date.format("yyyy-MM-dd'T'HH:mm:ssXXX")}">{post.date.format('MMMM dd, yyyy')}</time></span></a></article></li>
  {/if}
{/for}
</ul>

__Page MEETUP avec détails des conférences:__ [https://www.meetup.com/montreal-jug](https://www.meetup.com/montreal-jug)
