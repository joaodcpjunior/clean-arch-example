package com.joaodcpjunior.cleanarch.dataprovider.client.mapper;

import com.joaodcpjunior.cleanarch.core.domain.Address;
import com.joaodcpjunior.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
