package com.joaodcpjunior.cleanarch.entrypoint.controller.mapper;

import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.joaodcpjunior.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
