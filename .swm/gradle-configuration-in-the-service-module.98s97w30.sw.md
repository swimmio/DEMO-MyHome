---
title: Gradle Configuration in the Service Module
---
This document provides an in-depth explanation of how Gradle is used in the service module of the DEMO-MyHome project. It will cover the Gradle configuration file (build.gradle) and explain each step in the configuration file.

<SwmSnippet path="/service/build.gradle" line="17">

---

# Gradle Plugins

The `plugins` block is where we define the plugins that are required for this project. The `org.springframework.boot` plugin provides Spring Boot's Gradle features. The `jacoco` plugin provides code coverage metrics. The `net.researchgate.release` plugin is used for releasing the project.

```gradle
plugins {
  id 'org.springframework.boot'
  id 'jacoco'
  id 'net.researchgate.release'
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="23">

---

# Dependencies

The `dependencies` block is where we define the dependencies for the project. This includes the project dependencies, Spring Boot dependencies, testing dependencies, security dependencies, data persistence dependencies, and others.

```gradle
dependencies {

  implementation project(":api")

  // Spring web
  implementation 'org.springframework.boot:spring-boot-starter-web'

  // Spring actuator
  implementation 'org.springframework.boot:spring-boot-starter-actuator'

  // Spring test
  testImplementation('org.springframework.boot:spring-boot-starter-test') {
    exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
  }

  // Spring security
  implementation 'org.springframework.boot:spring-boot-starter-security'
  testImplementation 'org.springframework.security:spring-security-test'

  // Spring JPA
  implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="75">

---

# Jar Configuration

The `jar` block is where we configure the JAR file that will be generated by the build. The `archiveBaseName` is set to 'myhome-service' and the JAR generation is enabled.

```gradle
// Regular JAR needs to be created so that dependent projects such as
// integration-test can properly use classes from this project
jar {
  archiveBaseName = 'myhome-service'
  enabled = true
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="82">

---

# BootJar Configuration

The `bootJar` block is where we configure the bootable JAR file that will be generated by the build. The `archiveBaseName` is set to 'myhome-service-boot', the bootable JAR generation is enabled, and the `mainClassName` is set to 'com.myhome.MyHomeServiceApplication'.

```gradle
bootJar {
  archiveBaseName = 'myhome-service-boot'
  enabled = true

  mainClassName = 'com.myhome.MyHomeServiceApplication'
  manifest {
    attributes(
            'Implementation-Title': 'myhome-service',
            'Implementation-Version': archiveVersion
    )
  }
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="95">

---

# Java Compilation Configuration

The `compileJava` block is where we configure the Java compilation. This includes setting the annotation processor path and adding compiler arguments for Mapstruct.

```gradle
compileJava {
  // Mapstruct options
  options.annotationProcessorPath = configurations.annotationProcessor
  options.compilerArgs << "-Amapstruct.defaultComponentModel=spring"
  options.compilerArgs << "-Amapstruct.unmappedTargetPolicy=IGNORE"
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="102">

---

# Test Configuration

The `test` block is where we configure the testing. We specify that we want to use JUnit Platform for running the tests.

```gradle
test {
  useJUnitPlatform()
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/build.gradle" line="106">

---

# Jacoco Configuration

The `jacocoTestReport` block is where we configure the Jacoco test report. This includes enabling the XML report, disabling the CSV report, setting the HTML report destination, and excluding certain directories from the report.

```gradle
// Jacoco
test.finalizedBy jacocoTestReport

jacocoTestReport {
  dependsOn {
    test
  }
  reports {
    xml.enabled true
    csv.enabled false
    html.destination file("${buildDir}/jacoco/jacocoHtml")
  }

  // Keep this until mapstruct comes up with a better solution
  // https://github.com/mapstruct/mapstruct/issues/1528
  afterEvaluate {
    classDirectories.setFrom(files(classDirectories.files.collect {
      fileTree(dir: it, exclude: ['**/mapper/**', '**/mapper'])
    }))
  }
}
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
