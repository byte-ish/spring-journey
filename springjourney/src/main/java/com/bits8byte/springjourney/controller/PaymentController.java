package com.bits8byte.springjourney.controller;

import com.bits8byte.springjourney.model.Payment;
import com.bits8byte.springjourney.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processPayment(@RequestBody Payment payment) {
        String response = paymentService.processPayment(payment);
        return ResponseEntity.ok(response);
    }
}
