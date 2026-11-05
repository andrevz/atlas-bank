package com.atlas.bank.transaction.exception;

import java.math.BigDecimal;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(Long accountId, BigDecimal balance, BigDecimal amount) {
        super("La cuenta " + accountId + " tiene saldo de " + amount + " e intento transferir " + amount);
    }
}
