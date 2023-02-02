package com.joaodcpjunior.cleanarch.config;

import com.joaodcpjunior.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.joaodcpjunior.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.joaodcpjunior.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}
