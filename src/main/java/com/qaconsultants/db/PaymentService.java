package com.qaconsultants.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> allPayment(){
        List<Payment> znach2 = paymentRepository.findAll();
        return znach2;
    }
     public List<Payment> findByPaymentAmountLessThan(Double paymentAmount){
        List<Payment> znach3 = paymentRepository.findByPaymentAmountLessThan(paymentAmount);
        return znach3;
    }
  public List<DBInterface> findByName(Double paymentAmount){
     List<DBInterface> znach4 = paymentRepository.findByName(paymentAmount);
     return znach4;
    }
    public Double findByLastRowPayment() {
        Double znach5 = paymentRepository.findByLastRowPayment();
        return znach5;
    }
    public Payment findById(Integer id){
        Optional<Payment> znach6 = paymentRepository.findById(id);
        if (znach6.isPresent()){
        return znach6.get();}
        else {throw new IllegalArgumentException("NO");}
    }
}