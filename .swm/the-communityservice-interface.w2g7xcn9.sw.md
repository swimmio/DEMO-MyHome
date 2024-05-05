---
title: The CommunityService Interface
---
This document will cover the following aspects of the Community in the DEMO-MyHome project:

1. The role of the CommunityService interface
2. The methods provided by the CommunityService interface
3. The usage of the CommunityService interface in the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/CommunityService.java" line="28">

---

# The Role of the CommunityService Interface

The `CommunityService` interface provides a set of methods that define the operations related to a Community. These operations include creating a community, listing all communities, getting community details, adding admins and houses to a community, and deleting a community.

```java
public interface CommunityService {
  Community createCommunity(CommunityDto communityDto);

  Set<Community> listAll();

  Set<Community> listAll(Pageable pageable);

  Optional<Community> getCommunityDetailsById(String communityId);

  Optional<List<CommunityHouse>> findCommunityHousesById(String communityId, Pageable pageable);

  Optional<List<User>> findCommunityAdminsById(String communityId, Pageable pageable);

  Optional<User> findCommunityAdminById(String adminId);

  Optional<Community> getCommunityDetailsByIdWithAdmins(String communityId);

  Optional<Community> addAdminsToCommunity(String communityId, Set<String> admins);

  Set<String> addHousesToCommunity(String communityId, Set<CommunityHouse> houses);

```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/controllers/CommunityController.java" line="60">

---

# Usage of the CommunityService Interface in the Codebase

`CommunityService` is used in various parts of the codebase. For instance, in the `CommunityController` class, it is used to handle HTTP requests related to communities.

```java
  private final CommunityService communityService;
  private final CommunityApiMapper communityApiMapper;
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
