package com.qaconsultants.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    List<Payment> findByPaymentAmountLessThan(Double paymentAmount);

    @Query(nativeQuery = true, value = "select name, sum(paymentamount) as sumamount\n" +
            " from customers join payments on customers.id=payments.customerid\n" +
            " group by name\n" +
            " having sum(paymentamount) < :sum1")
    List<DBInterface> findByName(@Param("sum1") Double paymentAmount);

    @Query(nativeQuery = true, value = "SELECT paymentamount FROM payments ORDER BY id DESC LIMIT 1")
    Double findByLastRowPayment();
}


