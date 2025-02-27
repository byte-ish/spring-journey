package com.bits8byte.springjourney.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class CreditCardPayment implements Payment {
    private final String cardNumber;
    private final double amount;

    @Override
    public String process() {
        return "CC Payment Processed";
    }
}
