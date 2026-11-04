# FOR JUG Maintainers

[![Join the chat at https://gitter.im/montrealjug/montrealjug.github.io](https://badges.gitter.im/montrealjug/montrealjug.github.io.svg)](https://gitter.im/montrealjug/montrealjug.github.io?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

The site is built with [Roq](https://iamroq.dev/) (a Quarkus static site generator): Java 25 + Maven, no Ruby needed.

- Run locally with live reload: `./mvnw quarkus:dev`, then open http://localhost:8080
- Generate the static site into `target/roq`: `QUARKUS_ROQ_GENERATOR_BATCH=true ./mvnw package quarkus:run`
- Add a post: copy an existing file in `content/meetup/` (or `content/blog/`), named `YYYY-MM-DD-slug.md`, and edit its front matter
  (the URL is `/meetup/<slug>/`, the slug keeps the file name case)
- Speakers are in `data/authors.yml`, the menu in `data/navigation.yml`, site settings in `data/settings.yml`
- commit & push: GitHub Actions builds and deploys `main` to GitHub Pages

Where things live (Jekyll → Roq):

| Jekyll | Roq |
|---|---|
| `_posts/meetup`, `_posts/blog` | `content/meetup`, `content/blog` (one collection each) |
| pages (`team/index.md`, ...) | `content/team/index.md`, ... |
| `_layouts`, `_includes` (Liquid) | `templates/layouts`, `templates/partials` (Qute) |
| `_data` | `data` |
| `_config.yml` | `data/settings.yml` + `src/main/resources/application.properties` |
| `_sass`, `assets/css/main.scss` | `src/main/resources/web/app` (compiled by the Quarkus Web Bundler) |
| `images`, `assets`, icons, `CNAME` | `public` |

## Grunt

Grunt can be used to uglify, minify, etc images. Just type `grunt`. Look at `Grunfile.js` to understand what it's doing.

# So Simple Theme

Looking for a simple, responsive, theme for your Jekyll powered blog? Well look no further. Here be **So Simple Theme**, the followup to [**Minimal Mistakes**](http://mmistakes.github.io/minimal-mistakes/) -- by designer slash illustrator [Michael Rose](http://mademistakes.com).

[![Build Status](https://travis-ci.org/mmistakes/so-simple-theme.svg?branch=master)](https://travis-ci.org/mmistakes/so-simple-theme)

## So Simple Theme is all about:

* Responsive templates. Looking good on mobile, tablet, and desktop.
* Gracefully degrading in older browsers. Compatible with Internet Explorer 9+ and all modern browsers.
* Minimal embellishments and subtle animations.
* Optional large feature images for posts and pages.
* [Custom 404 page](http://mmistakes.github.io/so-simple-theme/404.html) to get you started.
* [Simple site search](https://github.com/christian-fei/Simple-Jekyll-Search)
* Support for Disqus Comments

![screenshot of So Simple Theme](http://mmistakes.github.io/so-simple-theme/images/so-simple-theme-preview.jpg)

See a [live version of So Simple](http://mmistakes.github.io/so-simple-theme/) hosted on GitHub.

---

## Getting Started

So Simple takes advantage of Sass and data files to make customizing easier. These features require Jekyll 2.x and will not work with older versions of Jekyll.

To learn how to install and use this theme check out the [Setup Guide](http://mmistakes.github.io/so-simple-theme/theme-setup/) for more information.

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/mmistakes/so-simple-theme/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
