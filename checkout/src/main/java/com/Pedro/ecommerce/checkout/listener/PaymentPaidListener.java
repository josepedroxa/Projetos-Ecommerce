package com.Pedro.ecommerce.checkout.listener;


import com.Pedro.ecommerce.checkout.entity.CheckoutEntity;
import com.Pedro.ecommerce.checkout.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor

public class PaymentPaidListener {

    private final CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler (PaymentCreatedEnvent event){
        final CheckoutEntity checkoutEntity = checkoutRepository.findByCode(event.getCheckoutCode().toString().orElse());
                checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
                checkoutRepository.saveAndFlush(checkoutEntity);
   }
}
