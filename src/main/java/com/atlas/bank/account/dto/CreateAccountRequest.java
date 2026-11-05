package com.atlas.bank.account.dto;

import lombok.Data;

import java.math.BigDecimal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

@Data
public class CreateAccountRequest {
    @NotBlank(message = "El número de cuenta es obligatorio")
    private String accountNumber;

    @NotBlank(message = "El nombre del titular es obligatorio")
    private String ownerName;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email no tiene un formato válido")
    private String email;

    @NotBlank(message = "El tipo de cuenta es obligatorio")
    private String type;

    @PositiveOrZero(message = "El balance no puede ser negativo")
    private BigDecimal balance;
}
