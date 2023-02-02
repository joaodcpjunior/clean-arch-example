package com.joaodcpjunior.cleanarch.entrypoint.controller;

import com.joaodcpjunior.cleanarch.core.usecase.InsertCustomerUseCase;
import com.joaodcpjunior.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.joaodcpjunior.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.zipCode());
        return ResponseEntity.ok().build();
    }
}
