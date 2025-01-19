package com.Ecommerce.enums.models.order;

public enum PaymentStatus {
    CANCELLED,
    WAITING_PAYMENT,
    WAITING_CONFIRM,
    CONFIRMED,
    DELIVERING,
    DELIVERED,
    COMPLETED,
    WAITING_ACCEPT_RETURN,
    RETURN_PROCESSING,
    DENIED_RETURN,
    RETURNED
}
