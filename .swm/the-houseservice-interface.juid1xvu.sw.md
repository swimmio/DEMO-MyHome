---
title: The HouseService Interface
---
This document will cover the role and functionality of the House in the DEMO-MyHome project. We'll cover:

1. The HouseService interface and its methods
2. The usage of HouseService in different parts of the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/HouseService.java" line="26">

---

# The HouseService Interface

The HouseService interface defines the operations related to a House. It includes methods for listing all houses, adding members to a house, deleting a member from a house, and retrieving house details and members by ID.

```java
public interface HouseService {
  Set<CommunityHouse> listAllHouses();

  Set<CommunityHouse> listAllHouses(Pageable pageable);

  Set<HouseMember> addHouseMembers(String houseId, Set<HouseMember> houseMembers);

  boolean deleteMemberFromHouse(String houseId, String memberId);

  Optional<CommunityHouse> getHouseDetailsById(String houseId);

  Optional<List<HouseMember>> getHouseMembersById(String houseId, Pageable pageable);

  Optional<List<HouseMember>> listHouseMembersForHousesOfUserId(String userId, Pageable pageable);
}
```

---

</SwmSnippet>

# Usage of HouseService in the Codebase

HouseService is implemented in HouseSDJpaService and is used in various parts of the codebase such as CommunitySDJpaService, HouseController, and UserController. It is primarily used to manage operations related to houses and their members.

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
