package com.qaconsultants;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CUSTOMERS")
@Component
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column
    private Double customerBalance;

    @Column(name = "CUSTOMERDEACTIVATED")
    private LocalDateTime customerDeActivated;

    @Column(name = "CUSTOMERACTIVATED", nullable = false)
    private LocalDateTime customerActivated;

    @Column(name = "BILLINGADDRESS")
    private String billingAddress;
}




