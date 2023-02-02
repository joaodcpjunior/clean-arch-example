package com.joaodcpjunior.cleanarch.entrypoint.consumer.message;

public record CustomerMessage(
        String id,
        String name,
        String zipCode,
        String cpf,
        Boolean isValidCpf
) {
}
