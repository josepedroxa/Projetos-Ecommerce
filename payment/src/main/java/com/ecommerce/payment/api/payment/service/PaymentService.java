package com.ecommerce.payment.api.payment.service;

import com.ecommerce.payment.api.payment.entity.PaymentEntity;
import com.ecommerce.payment.api.payment.listener.CheckoutCreatedEvent;

import java.util.Optional;

public abstract class PaymentService {
    abstract Optional <PaymentEntity> Create(CheckoutCreatedEvent checkoutCreatedEvent);

    public void create(CheckoutCreatedEvent checkoutCreatedEvent) {

    }
}
