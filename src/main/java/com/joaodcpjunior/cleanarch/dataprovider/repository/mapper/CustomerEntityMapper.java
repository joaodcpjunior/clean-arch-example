package com.joaodcpjunior.cleanarch.dataprovider.repository.mapper;

import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
