---
layout: post
title: "Le guide du développeur Java pour conteneuriser - Nicolas Fränkel"
excerpt: ""
meetup: 275554178
modified:
categories: meetup
hidden: false
author: nicolas_frankel
tags: []
comments: true
share: true
image:
feature:
date: 2021-01-28T12:00:00-04:00
---

Alors que le 'Cloud' devient de plus en plus répandu, le moment est venu d'évaluer comment conteneuriser une application Java. 
Je suppose que tout à chacun est en mesure d’écrire un fichier Docker pour lancer un JAR. 
Cependant, chaque fois que le code de l’application change, l’image entière doit être reconstruite. 
Si le déploiement a lieu dans un cluster Kubernetes, même local, cela augmente d'autant le temps de la boucle de rétroaction.

Dans cette présentation basée sur une démo, je présenterai différentes manières de porter une application Java dans un conteneur : Dockerfile, Jib et Cloud Native Buildpacks. 
Nous verrons également quel type d'image Docker ils génèrent, comment ils utilisent les couches d'images, si ces images sont compatibles avec skaffold, etc.

__Nicolas Fränkel__

Developer Advocate avec plus de 15 ans d'expérience dans le conseil pour de nombreux clients différents, dans une large palette de contextes (télécommunications, banque,  assurance, grande distribution et secteur public). 
Son focus est en général sur les technologies Java / Java EE et Spring, mais a des centres d'intérêts plus larges tels que les applications Internet riches, les tests, CI / CD et DevOps. 
Travaille actuellement pour Hazelcast. 
Également formateur et auteur d'ouvrages techniques.
