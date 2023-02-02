package com.joaodcpjunior.cleanarch.entrypoint.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public record CustomerRequest(
        @NotBlank
        String name,
        @NotBlank
        String cpf,
        @NotBlank
        String zipCode
) {
}
