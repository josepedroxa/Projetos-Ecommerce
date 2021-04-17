package com.ecommerce.payment.api.payment.repository;

import com.ecommerce.payment.api.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
