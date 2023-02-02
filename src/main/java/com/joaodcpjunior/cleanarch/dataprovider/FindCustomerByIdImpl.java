package com.joaodcpjunior.cleanarch.dataprovider;

import com.joaodcpjunior.cleanarch.core.dataprovider.FindCustomerById;
import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.dataprovider.repository.CustomerRepository;
import com.joaodcpjunior.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import com.joaodcpjunior.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class FindCustomerByIdImpl implements FindCustomerById {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
