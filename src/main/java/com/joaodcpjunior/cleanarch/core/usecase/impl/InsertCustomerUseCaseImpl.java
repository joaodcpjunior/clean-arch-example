package com.joaodcpjunior.cleanarch.core.usecase.impl;

import com.joaodcpjunior.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.joaodcpjunior.cleanarch.core.dataprovider.InsertCustomer;
import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
