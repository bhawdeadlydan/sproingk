# Sproink

Spring Boot with Kotlin

This software is in the Public Domain.  Please see [LICENSE.md](LICENSE.md).

## Spring features

* Spring 5 M4
* Actuator
* Boot with REST
* Sleuth
* Unit test with Boot 1.4 features
* Integration test with Boot 1.4 features
* Shows git details with actuator `/info` endpoint
* Example of REST batch round trip with status

## Other features

* Latest JUnit 5
* Quieter tests and runtime (always in progress!)

## Things to think about

* Logging is still to noisy during tests
* Some "bleeding edge" difficulties, e.g., Spring REST docs + Spring 5 beta
* Replace nested tests with scenario tests (see [Introduce first-class support for scenario tests #48](https://github.com/junit-team/junit5/issues/48), pending [5.0 M5](https://github.com/junit-team/junit5/milestone/8)https://github.com/junit-team/junit5/milestone/8) drop of JUnit

## Some reading

* [Developing Spring Boot applications with Kotlin](https://spring.io/blog/2016/02/15/developing-spring-boot-applications-with-kotlin)
* [Dipping into Spring Boot with Kotlin](https://medium.com/@mchlstckl/dipping-into-spring-boot-with-kotlin-31881edd13c2#.h26gsle9y)
* [The Journey of a Spring Boot application from Java 8 to Kotlin: The Application Class](http://engineering.pivotal.io/post/spring-boot-application-with-kotlin/)
* [Kotlin extensions for Spring projects](https://github.com/sdeleuze/spring-kotlin)
* [JUnit 5 with Spring Boot (plus Kotlin)](https://objectpartners.com/2016/07/26/junit-5-with-spring-boot-plus-kotlin/)
* [Testing improvements in Spring Boot 1.4](https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4)
* [REST and long-running jobs](http://farazdagi.com/blog/2014/rest-long-running-jobs/)
