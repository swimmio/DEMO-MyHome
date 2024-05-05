---
title: Booking Feature Overview
---
This document will cover the functionality and usage of the Booking feature in the DEMO-MyHome project. We'll cover:

1. The role of the BookingService interface
2. The deleteBooking method and its usage
3. The implementation of BookingService in different parts of the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/BookingService.java" line="3">

---

# The Role of the BookingService Interface

The `BookingService` interface is a contract for any class that wants to provide booking services. It currently has a single method `deleteBooking` which takes an amenityId and a bookingId as parameters and returns a boolean indicating the success of the operation.

```java
public interface BookingService {

  boolean deleteBooking(String amenityId, String bookingId);

}
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/BookingService.java" line="5">

---

# The deleteBooking Method

The `deleteBooking` method is used to delete a booking. It is defined in the `BookingService` interface and implemented in any class that provides booking services.

```java
  boolean deleteBooking(String amenityId, String bookingId);
```

---

</SwmSnippet>

# Implementation of BookingService

`BookingService` is implemented in `BookingSDJpaService` class and used in `BookingController` class. This shows that the booking services are provided by `BookingSDJpaService` and used by `BookingController` to handle HTTP requests related to bookings.

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
