---
title: Overview of the AmenityService
---
This document will cover the role and usage of the Amenity in the DEMO-MyHome project. We'll cover:

1. The AmenityService interface
2. The methods defined in the AmenityService interface
3. The usage of AmenityService in the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/AmenityService.java" line="25">

---

# The AmenityService Interface

The `AmenityService` interface defines the contract for any class that will provide services related to amenities. It includes methods for creating, retrieving, deleting, listing, and updating amenities.

```java
public interface AmenityService {

  Optional<List<AmenityDto>> createAmenities(Set<AmenityDto> amenities, String communityId);

  Optional<Amenity> getAmenityDetails(String amenityId);

  boolean deleteAmenity(String amenityId);

  Set<Amenity> listAllAmenities(String communityId);

  boolean updateAmenity(AmenityDto updatedAmenityDto);
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/springdatajpa/AmenitySDJpaService.java" line="37">

---

# Usage of AmenityService in the Codebase

`AmenitySDJpaService` is a class that implements the `AmenityService` interface. This class provides the actual implementation of the services defined in the interface.

```java
public class AmenitySDJpaService implements AmenityService {
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
