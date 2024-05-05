---
title: MailService Interface Overview
---
This document will cover the MailService interface in the DEMO-MyHome project. We'll cover:

1. The purpose of the MailService interface
2. The methods provided by the MailService interface
3. Where the MailService interface is implemented

# Purpose of the MailService Interface

The `MailService` interface in `service/src/main/java/com/myhome/services/MailService.java` is responsible for defining the contract for sending different types of emails in the application. It is not responsible for the actual implementation of sending emails, but it outlines what methods an actual mail service should provide.

<SwmSnippet path="/service/src/main/java/com/myhome/services/MailService.java" line="6">

---

# Methods Provided by the MailService Interface

The `MailService` interface provides four methods: `sendPasswordRecoverCode`, `sendAccountCreated`, `sendPasswordSuccessfullyChanged`, and `sendAccountConfirmed`. Each of these methods corresponds to a specific type of email that can be sent in the application.

```java
public interface MailService {

  boolean sendPasswordRecoverCode(User user, String randomCode);

  boolean sendAccountCreated(User user, SecurityToken emailConfirmToken);

  boolean sendPasswordSuccessfullyChanged(User user);

  boolean sendAccountConfirmed(User user);
}
```

---

</SwmSnippet>

# Implementations of the MailService Interface

The `MailService` interface is implemented in `service/src/main/java/com/myhome/services/springdatajpa/UserSDJpaService.java`, `service/src/main/java/com/myhome/services/springdatajpa/DevMailSDJpaService.java`, and `service/src/main/java/com/myhome/services/springdatajpa/MailSDJpaService.java`. These implementations handle the actual sending of emails.

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
