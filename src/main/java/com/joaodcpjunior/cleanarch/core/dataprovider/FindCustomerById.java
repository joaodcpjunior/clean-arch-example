package com.joaodcpjunior.cleanarch.core.dataprovider;

import com.joaodcpjunior.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(String id);
}
