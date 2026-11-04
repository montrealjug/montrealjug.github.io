---
layout: post
title: "Java Security Code Review: Shall we play a game? par Philippe Arteau"
excerpt: ""
meetup: 262422456
modified:
categories: meetup
hidden: false
author: philippe_arteau
tags: []
comments: true
share: true
image:
  feature:
date: 2019-06-27T17:30:00-04:00
---

__Java Security Code Review: Shall we play a game?  (en français / en anglais)__

*Cet atelier sera conduit par Philippe et des organisateurs du Montreal JUG - tous parlent français et anglais.*
*This workshop is lead by Philippe and some Montreal JUG organizers - all of them speak both french and english.*

__Description__

Java developers are building web applications, web services and other back-end components. These components may transport sensitive information, do business critical operations or transit credit cards. Security quickly becomes a concern for the business developing or operating the software. The application layer is now the number one target according to reported incidents [Source:DHS]. Having basic knowledge about security principles is not enough to provide solid defense against the average attacker.

This workshop's exercises will be on the code analysis of custom sample applications. The open-source tool Find Security Bugs will be used. For most of the vulnerabilities, a sample vulnerable application will be available for exploitation.

This workshop will cover the following classes of vulnerabilities:

- Path Traversal
- XXE
- HQL Injection
- Insecure Deserialization
- Expression Injection

Prérequis:

- Personal laptop
- IntelliJ IDEA https://www.jetbrains.com/idea/download/ **
- Burp HTTP Proxy https://portswigger.net/burp/communitydownload **

** Preferred tool: An equivalent tool can be used but support and demos will made for those listed.

__Présenté par / Presented by: Philippe Arteau__

Philippe is a security researcher working for GoSecure.

His research is focused on Web application security.

His past work experience includes pentesting, secure code review and software development.

He is the author of the widely-used Java static analysis tool Find Security Bugs.

He is also a contributor to the static analysis tool for .NET called Security Code Scan. 

He built many plugins for Burp and ZAP proxy tools: Retire.js, Reissue Request Scripter, CSP Auditor and many others. 

He presented at several conferences including Black Hat Arsenal, ATLSecCon, NorthSec, Hackfest (QC), 44CON, HackInParis and JavaOne. 

He has found a couple of vulnerabilities affecting the Spring Framework: CVE-2018-1260, CVE-2018-1272 and CVE-2018-1173.

