package com.qaconsultants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    // public ResultType methodOne(String param) {
    //    customerRepository.
    //    ResultType res = entityClassNameRepository.selectSomething(param);    assertSomething(res);    applySomeLogic(res);    return res;    }}
}