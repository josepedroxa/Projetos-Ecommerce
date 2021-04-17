package com.Pedro.ecommerce.checkout.service;
import br.Pedro.ecommerce.checkout.entity.CheckoutEntity;
import com.Pedro.ecommerce.checkout.entity.CheckoutEntity;
import resource.checkout.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
