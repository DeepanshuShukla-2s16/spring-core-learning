package com.deepanshu.spring_core_learning.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * Main service class demonstrating
 * @Qualifier annotation.
 */
public class OrderService {

    /*
     * Multiple PaymentService beans exist.
     * 
     * @Qualifier tells Spring exactly
     * which bean should be injected.
     */
    @Autowired
    @Qualifier("razorpayPaymentService")
    private PaymentService paymentService;

    /*
     * Business method.
     */
    public void placeOrder() {

        System.out.println("Order placed successfully.\n");

        paymentService.processPayment();
    }
}