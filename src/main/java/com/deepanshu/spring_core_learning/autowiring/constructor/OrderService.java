package com.deepanshu.spring_core_learning.autowiring.constructor;

/*
 * Main bean class demonstrating constructor based autowiring.
 */
public class OrderService {

    private PaymentGateway paymentGateway;

    /*
     * Constructor injection for dependency.
     * 
     * Spring automatically injects matching PaymentGateway bean.
     */
    public OrderService(PaymentGateway paymentGateway) {

        System.out.println("Constructor autowiring called.");

        this.paymentGateway = paymentGateway;
    }

    /*
     * Business method.
     */
    public void processOrder() {

        System.out.println("Order processing started...");
        System.out.println(paymentGateway);
    }
}