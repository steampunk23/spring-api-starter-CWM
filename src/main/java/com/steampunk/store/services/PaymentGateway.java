package com.steampunk.store.services;

import com.steampunk.store.entities.Order;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);
}
