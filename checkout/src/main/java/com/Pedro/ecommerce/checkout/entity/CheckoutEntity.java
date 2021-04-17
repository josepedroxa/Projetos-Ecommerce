package com.Pedro.ecommerce.checkout.entity;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@Builder
@Enumerated
public class CheckoutEntity {
    @Id
    @GeneratedValue
    private  long id;

    @Column
    private  String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private String status;
    public enum Status{
        CREATED,
        APPROVED
    }
}

