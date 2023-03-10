package com.joaodcpjunior.cleanarch.config;

import com.joaodcpjunior.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.joaodcpjunior.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.joaodcpjunior.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
