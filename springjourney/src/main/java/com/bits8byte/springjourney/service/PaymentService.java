package com.bits8byte.springjourney.service;

import com.bits8byte.springjourney.model.*;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(Payment payment) {
        return switch (payment) {
            case CreditCardPayment creditCardPayment -> creditCardPayment.process();
            case BankTransferPayment bankTransferPayment -> bankTransferPayment.process();
            case CashPayment cashPayment -> cashPayment.process();
            case DebitCardPayment debitCardPayment -> debitCardPayment.process();
        };
    }
}
