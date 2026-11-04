---
layout: post
title: "Refactoring Games : 15 things to do after extracting a method with Java"
excerpt: ""
meetup: 274782007
modified:
categories: meetup
hidden: false
author: victor_rentea
tags: []
comments: true
share: true
image:
feature:
date: 2020-11-26T17:00:00-04:00
---

In our quest against increasing complexity, Extract Method is probably the most important refactoring technique in our hands. 
We use it a dozen times per day as a first-level weapon, and very often it leads to us to deeper design insights. 
Let’s look at several such further actions you might take after pulling some code out in a separate method:

1. Reorder Parameters
2. Remove parameters by including more lines in what you extract (Ctrl-Z)
3. Add parameters for reuse by extract/inline variable at call site (Ctrl-Z)
4. Move method to object (for Feature Envy)
5. Encapsulate conditionals (great with Java8) 
6. Introduce Strategy Pattern for alternative large logic 
7. Distill switch expressions
8. Introduce Method Object for heavy logic
9. Early return errors
10. Extract static util functions
11. Spawn smart Value Object vs logic in Utils
12. Extract’n-test then mock away, leading to Separation by Layers of Abstraction
13. Command-Query Separation: mind the side effects 
14. Extract again - boolean vs SRP
15. Wrap call to safely add more code (Open-Closed)

__Victor Rentea__

Victor Rentea is a Java Champion, former Lead Architect at IBM, and the founder of Bucharest Software Craftsmanship Community in which he spreads the word about simple design, refactoring, and unit testing. 
He earns a living as a full-time trainer and consultant, working each week with teams in dozens of companies throughout the world. 
He constantly shares his passion in community talks (remote streamed these days) and conference talks. 
You can find him on Twitter, Facebook or LinkedIn as well as on his Teachable school.
