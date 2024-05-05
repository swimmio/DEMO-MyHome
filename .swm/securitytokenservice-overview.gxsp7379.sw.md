---
title: SecurityTokenService Overview
---
This document will cover the SecurityTokenService interface and its usage in the DEMO-MyHome project. We'll cover:

1. The purpose of the SecurityTokenService interface
2. The methods provided by the SecurityTokenService interface
3. How the SecurityTokenService interface is used in the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/SecurityTokenService.java" line="6">

---

# The Purpose of the SecurityTokenService Interface

The `SecurityTokenService` interface is designed to manage security tokens in the application. It provides methods to create and use security tokens.

```java
public interface SecurityTokenService {

  SecurityToken createEmailConfirmToken(User owner);

  SecurityToken createPasswordResetToken(User owner);

  SecurityToken useToken(SecurityToken token);
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/SecurityTokenService.java" line="8">

---

# Methods Provided by the SecurityTokenService Interface

The `SecurityTokenService` interface provides three methods: `createEmailConfirmToken`, `createPasswordResetToken`, and `useToken`. These methods are used to create email confirmation tokens, password reset tokens, and to use a given security token respectively.

```java
  SecurityToken createEmailConfirmToken(User owner);

  SecurityToken createPasswordResetToken(User owner);

  SecurityToken useToken(SecurityToken token);
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/springdatajpa/UserSDJpaService.java" line="54">

---

# Usage of the SecurityTokenService Interface in the Codebase

`SecurityTokenService` is used in `UserSDJpaService` to manage security tokens related to user operations.

```java
  private final SecurityTokenService securityTokenService;
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/springdatajpa/SecurityTokenSDJpaService.java" line="18">

---

`SecurityTokenService` is also implemented in `SecurityTokenSDJpaService` to provide the actual functionality of the security token operations.

```java
public class SecurityTokenSDJpaService implements SecurityTokenService {
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
