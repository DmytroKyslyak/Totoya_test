package com.qaconsultants;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMENTS")
@Component
@ToString
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "PAYMENTDATE", nullable = false)
    private LocalDateTime paymentsPaymentDate;

    @Column
    private Double paymentAmount;

    @Column(name = "CHANNEL")
    private String paymentChannel;

//    @Column(name = "CUSTOMERID", nullable = false)
    @ManyToOne
    @JoinColumn(name = "CUSTOMERID")
    private Customer paymentsCustomerId;
}