package com.bits8byte.springjourney.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class CashPayment implements Payment {
    private final double amount;
    @Override
    public String process() {
        return "Cash Payment Processed";
    }
}
