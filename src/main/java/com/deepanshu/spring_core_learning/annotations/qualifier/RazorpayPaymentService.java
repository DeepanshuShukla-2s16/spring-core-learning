package com.deepanshu.spring_core_learning.annotations.qualifier;

/*
 * Razorpay payment implementation.
 */
public class RazorpayPaymentService implements PaymentService {

    @Override
    public void processPayment() {

        System.out.println("Payment processed using Razorpay.");
    }
}