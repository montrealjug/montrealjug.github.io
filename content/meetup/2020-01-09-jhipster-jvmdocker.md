---
layout: post
title: "La JVM et Docker, symbiose parfaite par David Delabasee - Introduction à JHipster par Julien Dubois"
excerpt: ""
meetup: 267581791
modified:
categories: meetup
hidden: false
author: julien_dubois
tags: []
comments: true
share: true
image:
  feature:
date: 2020-01-09T17:30:00-04:00
---

Suivant la tradition, cette nouvelle année commence avec un duo de choc. 
Julien est Java Champion et évangéliste chez Microsoft.
David est évangéliste chez Oracle.

Bonne année à tous!

__La JVM et Docker, vers une symbiose parfaite par David Delabassee__

Les containeurs sont devenus en l'espace de quelques années un standard de-facto pour le déploiement de notre code que ce soit dans le Cloud ou 'On-premises', que ce soit pour des applications plus traditionnelles ou pour des fonctions Serverless... Les containeurs sont omniprésents, Docker en tête. De nouvelles plateformes, de nouveaux outils et frameworks ont rapidement émergés (ex. Knative, OpenFaas, Fn, JIB...) afin de simplifier l'utilisation de Docker. Parfois même, on utilise des containeurs sans nécessairement le savoir, i.e. Docker à l’insu de notre plein gré!

Cette session discute différentes approches et techniques afin d’optimiser l'utilisation de Java et de la JVM dans des containers. Nous allons aborder des points tels que jlink, CDS et AppCDS, GraalVM, Project Portola, etc. Nous allons enfin discuter de certaines améliorations présentes ou à venir qui visent à améliorer les interactions entre la JVM et les containeurs.

Bien que le langage Java soit utilisé pour cette session, cette discussion n’est en rien spécifique à Java et est applicable à tous les langages tournant sur la JVM, Kotlin, Groovy, Scala, etc.

__Présenté par David Delabassee__

David is a Developer Advocate in the Java Platform Group at Oracle. Prior to that, he was involved in Oracle’s Serverless initiatives. David has also been heavily involved in Java EE 8 and its transition to the Eclipse Foundation as part of the Jakarta EE initiative.
‎
Over the years, David has championed Java extensively throughout the world, by presenting at conferences and user groups, large and small. He blogs at [https://delabassee.com](https://delabassee.com) and has authored many technical articles for various publications.

David lives in Belgium. In his spare time, he enjoys playing video games with his daughter and tinkering with technologies such as domotics, electronics, and pinballs.

__Introduction à JHipster par Julien Dubois__

[JHipster](https://www.jhipster.tech/) est aujourd’hui l’un des projets Open Source Java les plus populaires, avec plus de 15,000 étoiles sur GitHub, plus de 500 contributeurs, et des centaines d’entreprises utilisatrices. Il permet de générer en un temps record une application complète, utilisant une stack moderne basée sur Spring Boot, Angular ou React. L’intégration de nombreuses technologies prêtes à l’emploi avec un focus à la fois sur l’expérience développeur, la qualité du code et la mise en production, en font un outil reconnu pour qui veut rapidement réaliser une application métier.

Dans cette session introductive, nous étudierons les principales options proposées par JHipster, et nous réaliserons une application de bout en bout: génération du code, utilisation les workflows prêts à l’emploi, et mise en production. Ce sera également l’occasion de faire le point sur les dernières nouveautés du projet et de parler de sa roadmap.

__Présenté par Julien__

Julien Dubois est Cloud Developer Advocate chez Microsoft.
Il est connu pour être le créateur et principal développeur du projet JHipster, ainsi que pour être un Java Champion. Au cours des 20 dernières années, Julien a principalement travaillé sur les technologies Java et Spring en tant qu'architecte et consultant, travaillant pour de nombreux clients à travers toutes les industries. Comme il aime partager sa passion, Julien a écrit un livre sur Spring, parlé à plus de 100 conférences internationales, et a créé plusieurs projets Open Source populaires. En ce moment, Julien se focalise sur l'amélioration de l'expérience développeur autour de Java et Spring sur Azure.
