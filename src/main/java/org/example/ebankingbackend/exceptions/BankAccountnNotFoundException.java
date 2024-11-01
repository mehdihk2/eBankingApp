package org.example.ebankingbackend.exceptions;

public class BankAccountnNotFoundException extends RuntimeException {
    public BankAccountnNotFoundException(String message) {
        super(message);
    }
}
