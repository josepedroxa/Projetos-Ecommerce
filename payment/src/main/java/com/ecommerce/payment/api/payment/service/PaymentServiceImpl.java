package com.ecommerce.payment.api.payment.service;


import com.ecommerce.payment.api.payment.entity.PaymentEntity;
import com.ecommerce.payment.api.payment.listener.CheckoutCreatedEvent;
import com.ecommerce.payment.api.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentServiceImpI {
    private final PaymentRepository paymentRepository;


    public Optional<PaymentEntity> create(@NotNull CheckoutCreatedEvent checkoutCreatedEvent) {
        final PaymentEntity paymentEntity = PaymentEntity.builder()
                .checkoutCode(checkoutCreatedEvent.getCheckoutCode())
                .code(UUID.randomUUID().toString())
                .build();
        paymentRepository.save(paymentEntity);
        return Optional.of(paymentEntity);
    }
}