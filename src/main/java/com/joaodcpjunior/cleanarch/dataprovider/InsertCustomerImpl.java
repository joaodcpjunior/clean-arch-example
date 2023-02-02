package com.joaodcpjunior.cleanarch.dataprovider;

import com.joaodcpjunior.cleanarch.core.dataprovider.InsertCustomer;
import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.dataprovider.repository.CustomerRepository;
import com.joaodcpjunior.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.joaodcpjunior.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
