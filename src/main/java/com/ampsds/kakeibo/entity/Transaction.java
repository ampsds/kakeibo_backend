package com.ampsds.kakeibo.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate date;
    private BigDecimal amount;
    private String description;

    // @ManyToOne
    // @JoinColumn(name = "type_id")
    // private TransactionType type;

    // @ManyToOne
    // @JoinColumn(name = "category_id")
    // private Category category;

    // @ManyToOne
    // @JoinColumn(name = "payment_method_id")
    // private PaymentMethod paymentMethod;

}