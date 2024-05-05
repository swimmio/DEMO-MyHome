---
title: Utilization of HouseService Across Different Components of the Application
---
This document will cover the usage of the `HouseService` interface in the DEMO-MyHome application. We'll cover:

1. The purpose of the `HouseService` interface
2. The methods provided by `HouseService` and their usage.

# Purpose of the HouseService Interface

`HouseService` is an interface that defines the contract for operations related to houses in the application. It is implemented by classes that provide concrete implementations for these operations.

<SwmSnippet path="/service/src/main/java/com/myhome/services/HouseService.java" line="26">

---

# Methods Provided by HouseService

`HouseService` provides several methods for managing houses and their members. For example, `listAllHouses()` returns all houses, `addHouseMembers(String houseId, Set<HouseMember> houseMembers)` adds members to a specific house, and `getHouseDetailsById(String houseId)` retrieves the details of a specific house.

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

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
