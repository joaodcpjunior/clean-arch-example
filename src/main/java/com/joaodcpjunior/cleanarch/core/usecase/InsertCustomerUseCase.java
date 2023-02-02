package com.joaodcpjunior.cleanarch.core.usecase;

import com.joaodcpjunior.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
