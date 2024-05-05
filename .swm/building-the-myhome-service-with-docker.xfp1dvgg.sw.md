---
title: Building the MyHome Service with Docker
---
This document covers the process of building the MyHome service using Docker. It will go through the build and configuration steps in the Dockerfile and docker-compose.yml files step by step.

<SwmSnippet path="/Dockerfile" line="1">

---

## Dockerfile Configuration

The Dockerfile starts with the `azul/zulu-openjdk-alpine:8-jre` base image, which includes Java 8 runtime. The JAR file from the service build is copied into the image as `app.jar`. The application is set to run on port 8080. The entry point for the application is set to run the `app.jar` file using Java.

```
FROM azul/zulu-openjdk-alpine:8-jre
ARG JAR_FILE=service/build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
```

---

</SwmSnippet>

<SwmSnippet path="/docker-compose.yml" line="1">

---

## Docker Compose Configuration

The docker-compose file defines the services that make up the application. The `myhome-service` is built using the Dockerfile in the current directory. The service is set to run in a container named `myhome-service`. The application inside the container is set to run on port 8080, which is mapped to port 8080 on the host machine.

```yaml
version: '3.0'

services:
  myhome-service:
    image: jmprathab/myhome-service:${TAG:-latest}
    build:
      context: .
      dockerfile: Dockerfile
    container_name: "myhome-service"
    expose:
      - "8080"
    ports:
      - "8080:8080"

```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
