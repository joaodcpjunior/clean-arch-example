package com.joaodcpjunior.cleanarch.config;

import com.joaodcpjunior.cleanarch.core.dataprovider.FindCustomerById;
import com.joaodcpjunior.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.joaodcpjunior.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
