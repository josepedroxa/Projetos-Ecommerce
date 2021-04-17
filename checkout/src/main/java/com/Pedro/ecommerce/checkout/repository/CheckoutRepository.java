package com.Pedro.ecommerce.checkout.repository;

mport org.springframework.stereotype.Repository;

@Repository

public interface CheckoutRepository<CheckoutEntity> extends JpaRepository<CheckoutEntity, Long> {
}
