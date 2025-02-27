package com.bits8byte.springjourney.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class BankTransferPayment implements Payment {
    private final String iban;
    private final double amount;

    @Override
    public String process() {
        return "Bank Transfer Payment Processed";
    }
}
