package com.bits8byte.springjourney.model;

public final class DebitCardPayment implements Payment{
    @Override
    public String process() {
        return "DC Payment Processed";
    }
}
