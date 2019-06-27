[![Build_status](https://travis-ci.org/ArtComputerSE/ajavahtmlrenderer.svg?branch=master)](https://travis-ci.org/ArtComputerSE/ajavahtmlrenderer)
[![Sonar](https://sonarcloud.io/api/project_badges/measure?project=se.artcomputer.html%3Aajavahtmlrenderer&metric=alert_status)](https://sonarcloud.io/dashboard?id=se.artcomputer.html%3Aajavahtmlrenderer)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=se.artcomputer.html%3Aajavahtmlrenderer&metric=bugs)](https://sonarcloud.io/dashboard?id=se.artcomputer.html%3Aajavahtmlrenderer)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=se.artcomputer.html%3Aajavahtmlrenderer&metric=coverage)](https://sonarcloud.io/dashboard?id=se.artcomputer.html%3Aajavahtmlrenderer)
[![LOC](https://sonarcloud.io/api/project_badges/measure?project=se.artcomputer.html%3Aajavahtmlrenderer&metric=ncloc)](https://sonarcloud.io/dashboard?id=se.artcomputer.html%3Aajavahtmlrenderer)
[![Download](https://api.bintray.com/packages/perty/ArtComputerSE/ajavahtmlrenderer/images/download.svg) ](https://bintray.com/perty/ArtComputerSE/ajavahtmlrenderer/_latestVersion)

#  A Java html renderer
Based on ideas from programming in Elm, this Java library gives you HTML rendering for 
small UI use cases.

## Motivation
Why would you need this? There are already so many template libraries out there?
Besides, nowadays you write everything in JavaScript!

Yes. But we also have microservices. A microservice has the full stack from persistence, 
through application logic and up to the user interface. But apps that are
useful for an end user is typically written for that user and calls
many microservices, aggregating the result.

However, there are some things we might need to do when maintaining the 
microservice itself. Change the configuration, look at some specific statistics or
understand something about what's going on.

In that situation, you probably not want to pull in gigabytes of Node packages just
to render some html. So why not a template engine?

My problem with them is that they introduce their own complexity and type safety is 
out the window.

## What is here

This is a super simple little Java library where you can create any HTML snippet you like 
without leaving Java. Of course you need to know the basics of HTML, but I guess you already
do that.

The repository contains also a demo application written in Spring Boot. It serves some
really hideous pages. Here is an example from it, giving you a feel for the design
philosophy.

```java
@RestController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return html(
                head(
                      link(styleSheet("/main.css"))
                ),
                body(
                        attributes(blueText),
                        h1(
                                attributes(greenText),
                                text("Greetings from Spring Boot!")),
                        div(
                                text("Here we thrive with Java rendering pages.")),
                        div(
                                a(
                                        attributes(className("button"), href("/next")),
                                        text("Click here for next page"))
                        ),
                        div(
                                a(
                                        attributes(className("button"), href("/form")),
                                        text("Or here for a form demo!")
                                )
                        )
                )
        ).toString();
    }
}

```
As you can see, we used create a structure which we turn into a string.

Of course you can use all your Java refactoring tools to restructure your site. Extract
methods to reuse elements that come again and again, like headers and footers. Perhaps
build a library of little components that you can reuse across different microservices?

## Status

Alpha.

## Alternatives

- j2html https://github.com/tipsy/j2html. Has another style that you may prefer and obviously been around for longer.

 
