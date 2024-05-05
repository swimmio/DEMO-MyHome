---
title: Using Gradle in Project
---
This document provides a detailed explanation of how Gradle is used in the DEMO-MyHome project. It covers the configuration and execution of Gradle tasks in the project.

<SwmSnippet path="/settings.gradle" line="17">

---

# Gradle Configuration

The `settings.gradle` file is where the project modules are defined and included. It also specifies the root project name. The `pluginManagement` block is used to define the plugins and their versions that are used across the project.

```gradle
pluginManagement {
  plugins {
    id 'org.springframework.boot' version "${springBootVersion}"
    id 'io.spring.dependency-management' version "${springDependencyManagementVersion}"
    id 'net.researchgate.release' version "${researchgateReleaseVersion}"
    id "org.openapi.generator" version "${openApiVersion}"
  }
}

rootProject.name = 'myhome-service'
include 'integration-tests'
include 'service'
include 'api'

```

---

</SwmSnippet>

<SwmSnippet path="/build.gradle" line="17">

---

# Gradle Build Script

The `build.gradle` file is the main build script for the project. It applies the necessary plugins, defines the repositories for dependencies, sets the group and version for the project, and configures the Java plugin. It also sets up configurations for development and runtime classpaths.

```gradle
plugins {
  id 'io.spring.dependency-management'
  id 'java'
}

allprojects {
  repositories {
    mavenCentral()
  }
}

subprojects {
  group = 'com.prathab'
  version = '2.0.0'
  sourceCompatibility = '8'

  apply plugin: 'java'
  apply plugin: 'io.spring.dependency-management'

  configurations {
    developmentOnly
```

---

</SwmSnippet>

<SwmSnippet path="/gradlew" line="1">

---

# Gradle Wrapper

The `gradlew` file is the Gradle Wrapper script. It ensures that the correct version of Gradle is used for building the project, even if it is not installed on the machine. It sets up the Java command to start the JVM and executes the Gradle command.

```
#!/usr/bin/env sh

#
# Copyright 2015 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

##############################################################################
##
##  Gradle start up script for UN*X
```

---

</SwmSnippet>

<SwmSnippet path="/gradle/wrapper/gradle-wrapper.properties" line="16">

---

# Gradle Wrapper Properties

The `gradle-wrapper.properties` file contains properties for the Gradle Wrapper. It specifies the distribution URL for downloading the correct version of Gradle if it's not already downloaded.

```ini
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-6.3-bin.zip
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
