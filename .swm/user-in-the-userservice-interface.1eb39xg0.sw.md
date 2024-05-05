---
title: User in the UserService Interface
---
This document will cover the following aspects of the User in the DEMO-MyHome project:

1. The role of the User in the UserService interface
2. The methods related to User in the UserService interface
3. The usage of these methods in the codebase

<SwmSnippet path="/service/src/main/java/com/myhome/services/UserService.java" line="30">

---

# The Role of User in the UserService Interface

The UserService interface defines the contract for operations related to User. It includes methods for creating a user, resending email confirmation, listing all users, getting user details, requesting and resetting password, and confirming email.

```java
public interface UserService {
  Optional<UserDto> createUser(UserDto request);

  boolean resendEmailConfirm(String userId);

  Set<User> listAll();

  Set<User> listAll(Pageable pageable);

  Optional<UserDto> getUserDetails(String userId);

  boolean requestResetPassword(ForgotPasswordRequest forgotPasswordRequest);

  boolean resetPassword(ForgotPasswordRequest passwordResetRequest);

  Boolean confirmEmail(String userId, String emailConfirmToken);
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/controllers/UserController.java" line="63">

---

# Usage of User Methods in the Codebase

The `createUser` method from UserService is used in the UserController's signUp method to create a new user.

```java
    UserDto requestUserDto = userApiMapper.createUserRequestToUserDto(request);
    Optional<UserDto> createdUserDto = userService.createUser(requestUserDto);
    return createdUserDto
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
