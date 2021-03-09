package com.qaconsultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> allCustomers(){
        List<Customer> znach = customerRepository.findAll();
        return znach;
    }
    public List<Customer> findByCustomerBalance(Double customerBalance){
        List<Customer> znach1 = customerRepository.findByCustomerBalance(customerBalance);
        return znach1;
    }


}
