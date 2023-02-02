package com.joaodcpjunior.cleanarch.core.dataprovider;

import com.joaodcpjunior.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
