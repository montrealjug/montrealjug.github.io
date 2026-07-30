---
layout: post
title: "Modern Java Puzzlers & Keeping Your Java Hot by Solving the JVM Startup and Warmup Problem"
excerpt: ""
meetup: 315882307
modified:
categories: [meetup]
hidden: false
author: simon_ritter
coauthors: []
tags: []
comments: true
share: true
image:
feature:
date: 2026-08-06T17:30:00-04:00
---


### Modern Java Puzzlers

Since JDK 9, Java, as a language, has evolved faster than at any point in its 30-year history.  For developers, this is great, as it means we get more new features that make our code more concise and, hopefully, easier to read and understand.

All new language features also bring their quirks and possibly unseen consequences.

In this fun interactive session, we’ll examine a range of recent language features and pose questions to the audience about how the code works and what it does.

We’ll cover many of the new language features from recent releases, including switch expressions, sealed classes and pattern matching.

The answers will most definitely not always be as you expect!

### Keeping Your Java Hot by Solving the JVM Startup and Warmup Problem

Java bytecodes and class files deliver on the original vision of “write once, run anywhere”.  Using a Just-in-Time (JIT) compiler allows JVM-based applications to compile only the code that’s used frequently and optimise it precisely for how it's used.  Using techniques like speculative optimisation can often deliver better performance than static, Ahead-of-Time (AOT) compiled code.

However, this flexibility and performance come at a cost.  Each time the JVM starts an application, it must perform the same analysis to identify hot spots in the code and compile them.  This is referred to as the application warmup time.

In this session, we’ll look at several approaches to alleviating or even eliminating this problem.  Specifically:

·   	Static compilation of Java code ahead-of-time (AOT).  Specifically, the Graal native image approach
·   	Generating a JIT compiler profile of a running, warmed-up application that can be reused when the same application is restarted, eliminating the need for much of the JIT compilation.  This will include details of the work of the OpenJDK Project Leyden.
·   	Decoupling the JIT compiler from the JVM for a Cloud environment.  Providing a centralised JIT-as-a-Service allows caching of compiled code and offloading the compilation work when new code must be compiled.
·   	Creating a checkpoint of a running application.  This includes all application state (heap, stack, etc.) in addition to the JIT-compiled code.  Project CRaC will be used as an example.

At the end of the session, you’ll be all set to keep your Java hot!

#### 🎤 Speaker: Simon Ritter

Simon Ritter is the Deputy CTO of Azul.  Simon joined Sun Microsystems in 1996 and spent time working in both Java development and consultancy.  He has been presenting Java technologies to developers since 1999 focusing on the core Java platform as well as client and embedded applications.  At Azul, he continues to help people understand Java and AzulÕs JVM products.

Simon is a Java Champion and two time recipient of the JavaOne Rockstar award.  In addition, he represents Azul on the JCP Executive Committee, the OpenJDK Vulnerability Group as well as the JSR Expert Group since Java SE 9.

📍 Lieu : 355 rue Ste-Catherine Ouest #700, Montréal, QC H3B 1A5
