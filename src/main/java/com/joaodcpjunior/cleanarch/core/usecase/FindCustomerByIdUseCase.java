package com.joaodcpjunior.cleanarch.core.usecase;

import com.joaodcpjunior.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(String id);
}
