package com.deepanshu.spring_core_learning.annotations.qualifier;

/*
 * PayPal payment implementation.
 */
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment() {

        System.out.println("Payment processed using PayPal.");
    }
}