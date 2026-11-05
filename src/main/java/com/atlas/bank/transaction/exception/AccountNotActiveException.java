package com.atlas.bank.transaction.exception;

public class AccountNotActiveException extends RuntimeException {
    public AccountNotActiveException(String status, Long accountId) {
        super("La cuenta " + accountId + " no esta activa. Estado actual: " + status);
    }
}
