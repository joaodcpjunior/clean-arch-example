package com.joaodcpjunior.cleanarch.entrypoint.controller.response;

public record CustomerResponse(
        String name,
        String cpf,
        Boolean isValidCpf,
        AddressResponse addressResponse
) {
}
