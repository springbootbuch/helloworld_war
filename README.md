# Deploy a Spring Boot application as war file to an application container

This demo shows how you can create a Spring Boot application that can both be deployed to any Servlet 3.0 container and run as a "fat-war".

It also makes use of a JNDI database connection for Spring Data JPA repositories.

To build and run the demo you got to have Docker installed.

Build with

```
mvn docker:build
```

and run (in foreground) with

```
mvn docker:run
```

or as a daemon

```
mvn docker:start
```

Example URLs can be accessed under


```
http://127.0.0.1:8980/helloworld_war/hello?name=SpringBoot
```

and

```
http://127.0.0.1:8980/helloworld_war/greetings
```