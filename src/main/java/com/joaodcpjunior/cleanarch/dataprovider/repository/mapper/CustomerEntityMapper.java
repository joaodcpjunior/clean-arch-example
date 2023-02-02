package com.joaodcpjunior.cleanarch.dataprovider.repository.mapper;

import com.joaodcpjunior.cleanarch.core.domain.Customer;
import com.joaodcpjunior.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
