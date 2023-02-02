package com.joaodcpjunior.cleanarch.entrypoint.controller.response;

public record AddressResponse(
        String street,
        String city,
        String state
) {
}
