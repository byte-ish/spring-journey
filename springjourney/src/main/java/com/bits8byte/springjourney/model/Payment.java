package com.bits8byte.springjourney.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CreditCardPayment.class, name = "CREDIT_CARD"),
        @JsonSubTypes.Type(value = DebitCardPayment.class, name = "DEBIT_CARD"),
        @JsonSubTypes.Type(value = BankTransferPayment.class, name = "BANK_TRANSFER"),
        @JsonSubTypes.Type(value = CashPayment.class, name = "CASH")
})
public sealed interface Payment permits CreditCardPayment, DebitCardPayment, BankTransferPayment, CashPayment {

    String process();

}
