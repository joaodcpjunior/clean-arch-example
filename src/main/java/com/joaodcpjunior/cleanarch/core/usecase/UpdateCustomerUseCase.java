package com.joaodcpjunior.cleanarch.core.usecase;

import com.joaodcpjunior.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
