package com.qaconsultants.db;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("pageObjectDB")
@Log4j2
public class PageObjectDB {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private PaymentService paymentService;

    public void getCustomers() {
//        List<Customer> blockCustomers = customerService.allCustomers();
//        log.warn(blockCustomers); // выводит на экран в виде ПРЕДУПРЕЖДЕНИЧЯ

        List<Customer> blockCustomers = customerService.findByCustomerBalance(100.24);
        log.warn(blockCustomers);
    }

    public void getPayments() {
        List<Payment> allPay = paymentService.allPayment();
        log.warn(allPay);

//        List<Payment> blockPayments = paymentService.findByPaymentAmountLessThan(0.1);
//        log.warn(blockPayments);
    }

    public void getTotalAmount(String sum){
        List<DBInterface> blockPayments1 = paymentService.findByName(Double.valueOf(sum));
        for (DBInterface users:blockPayments1
             ) {
            log.warn(users.getName() +" "+ users.getSumAmount());
        }
    }

    public Double getLastRowPayment() {
        Double lastPayment = paymentService.findByLastRowPayment();
        log.warn(lastPayment);
        return lastPayment;
    }
}