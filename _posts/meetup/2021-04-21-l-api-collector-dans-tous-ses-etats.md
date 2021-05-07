---
layout: post
title: "L'API Collector dans tous ses états - José Paumard"
excerpt: ""
meetup: 277268036
modified:
categories: meetup
hidden: false
author: jose_paumard
tags: []
comments: true
share: true
image:
feature:
date: 2021-04-21T17:00:00-4:00
---

Introduite en Java 8, l'API Collector vit depuis dans l'ombre de l'API Stream. 
Cette API est organisée de sorte que l'on utilise surtout les collectors sur étagère : toList, groupingBy, counting et quelques autres. 
Ces éléments masquent le modèle de traitement de données des collectors et en particulier sa puissance.

Je vous propose donc de parler des collectors : ceux qui existent, car il faut les connaître, ceux que l'on peut créer, ceux dont on se doute que l'on peut les créer une fois que l'on comprend un peu les choses, et les autres : les possibilités offertes par cette API sont illimitées.

On parlera du concept de "downstream collector", central dans cette API. 
On montrera comment écrire des traitements entiers sous forme de collectors, de façon à pouvoir les passer en paramètre d'autres traitements.

Quelques slides et surtout des exemples réels en live coding.

__José Paumard__

Passionné par la programmation depuis le début des années 80, José a fait ses débuts en C et assembleur avant d'utiliser Java dès sa sortie en 1995. 
Docteur en mathématiques appliquées, maître de conférences à l'université Sorbonne Paris Nord depuis 25 ans, Java Champion, 3 fois élu Java Rockstar à JavaOne, José propose régulièrement des présentations dans les grandes conférences de par le monde : JavaOne, Oracle CodeOne, Devoxx (Belgique, France, Londres), DevNexus, GoTo, JFokus. 
Il est l'auteur d'articles techniques pour Java Magazine et Oracle Technolgy Network. Il tient un blog, [Java le Soir](http://blog.paumard.org), source de documentation en français pour des milliers de développeurs et une chaîne YouTube, [cours-en-ligne](https://www.youtube.com/channel/UCIatmtIm9z5YEWuHbrUMLsw) qui regroupe environ 75h de cours Java en français. 
Il est enfin auteur de cours Java pour Pluralsight. 
Il est membre du Paris JUG depuis 10 ans, a été co-organisateur de Devoxx France pendant 3 ans et a lancé JChateau en mars 2020, non-conférence désorganisée dans la Vallée de la Loire.
