package com.qaconsultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> allPayment(){
        List<Payment> znach3 = paymentRepository.findAll();
        return znach3;
    }
     public List<Payment> findByPaymentAmountLessThan(Double paymentAmount){
        List<Payment> znach2 = paymentRepository.findByPaymentAmountLessThan(paymentAmount);
        return znach2;
    }

  public List<BDInterface> findByName(Double paymentAmount){
     List<BDInterface> znach3 = paymentRepository.findByName(paymentAmount);
     return znach3;
    }


}