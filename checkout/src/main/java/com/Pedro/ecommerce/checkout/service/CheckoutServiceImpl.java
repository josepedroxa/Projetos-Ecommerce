package com.Pedro.ecommerce.checkout.service;


import Streaming.CheckoutCreatedSource;
import com.Pedro.ecommerce.checkout.entity.CheckoutEntity;
import com.Pedro.ecommerce.checkout.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;
import resource.checkout.checkout.CheckoutRequest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
            public Optional <CheckoutEntity> create(CheckoutRequest checkoutRequest){
            final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                    .code(UUID.randomUUID().toString())
                    .build();
            final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);
            final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent).build());
             .setCheckoutCode(entity.getCode())
             .setStatus(entity.getStatus().name())
             .build();
             checkoutCreatedSource.output().send(MessageBuilder.withPayload(checkoutCreatedEvent.build));
            return Optional.of(entity);
    }
}