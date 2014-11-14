---
layout: post
title: "JSR-107 (javax.cache) Dans La Pratique"
excerpt: "Il aura fallu 10 ans pour sa réalisation mais voici la JSR-107 enfin finalisée."
meetup: 218604404
modified:
categories: meetup
author: alex_snaps
tags: []
comments: true
share: true
image:
  feature:
date: 2014-12-04T17:30:00-05:00
---

Il aura fallu 10 ans pour sa réalisation mais voici la JSR-107 enfin finalisée. Nous avons à présent une API de cache standard pour la plate-forme Java. Mais qu'est-ce que cela signifie pour vous? Qu'en est-il de ses fonctionnalités dans la pratique ? Supporte-t'elle les transactions ? Comment utiliser efficacement cette nouvelle API pour résoudre les vrais problèmes de votre application?


Dans cette session, nous vous introduirons rapidement à l'API, mais nous nous concentrerons ensuite sur la résolution de problèmes concrets de mise en cache, grâce à une exploration plus détaillée de l'API javax.cache. Nous verrons comment l'utiliser de manière explicite (cache-aside, cache-through, ...) ou implicite par l'intermédiaire de librairies (comme Hibernate ou Spring).


Nous couvrirons également certains détails d'implémentation qu'il est intéressant de connaitre lorsque vous ferez votre choix de moteur de cache, surtout si vous prévoyez de pousser la spécification à ses limites, comme dans le cas d'environnements distribués.
