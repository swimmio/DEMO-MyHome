---
title: Payment Feature Overview
---
This document will cover the following aspects of the Payment feature in the DEMO-MyHome project:

1. The role of the PaymentService interface
2. The methods provided by the PaymentService interface and their usage in the codebase.

<SwmSnippet path="/service/src/main/java/com/myhome/services/PaymentService.java" line="30">

---

# The Role of the PaymentService Interface

The `PaymentService` interface is the service layer for the Payment feature. It provides several methods to handle different aspects of payments, such as scheduling a payment, retrieving payment details, and getting payments by member or admin.

```java
public interface PaymentService {
  PaymentDto schedulePayment(PaymentDto request);

  Optional<PaymentDto> getPaymentDetails(String paymentId);

  Set<Payment> getPaymentsByMember(String memberId);

  Page<Payment> getPaymentsByAdmin(String adminId, Pageable pageable);

  Optional<HouseMember> getHouseMember(String memberId);
}
```

---

</SwmSnippet>

<SwmSnippet path="/service/src/main/java/com/myhome/services/PaymentService.java" line="31">

---

# Methods of the PaymentService Interface

The `PaymentService` interface provides four key methods: `schedulePayment`, `getPaymentDetails`, `getPaymentsByMember`, and `getPaymentsByAdmin`. These methods are used throughout the codebase to handle different aspects of payments. For example, `schedulePayment` is used to schedule a new payment, `getPaymentDetails` is used to retrieve the details of a specific payment, `getPaymentsByMember` is used to get all payments made by a specific member, and `getPaymentsByAdmin` is used to get all payments overseen by a specific admin.

```java
  PaymentDto schedulePayment(PaymentDto request);

  Optional<PaymentDto> getPaymentDetails(String paymentId);

  Set<Payment> getPaymentsByMember(String memberId);

  Page<Payment> getPaymentsByAdmin(String adminId, Pageable pageable);

  Optional<HouseMember> getHouseMember(String memberId);
```

---

</SwmSnippet>

&nbsp;

*This is an auto-generated document by Swimm AI 🌊 and has not yet been verified by a human*

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBREVNTy1NeUhvbWUlM0ElM0Fzd2ltbWlv" repo-name="DEMO-MyHome"><sup>Powered by [Swimm](/)</sup></SwmMeta>
