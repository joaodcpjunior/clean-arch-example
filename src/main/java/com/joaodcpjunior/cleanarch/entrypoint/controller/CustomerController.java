package com.joaodcpjunior.cleanarch.entrypoint.controller;

import com.joaodcpjunior.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.joaodcpjunior.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.joaodcpjunior.cleanarch.core.usecase.InsertCustomerUseCase;
import com.joaodcpjunior.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.joaodcpjunior.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.joaodcpjunior.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.joaodcpjunior.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;
    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;
    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;
    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.zipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.zipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}