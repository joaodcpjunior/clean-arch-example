package com.joaodcpjunior.cleanarch.config;

import com.joaodcpjunior.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.joaodcpjunior.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.joaodcpjunior.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.joaodcpjunior.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
