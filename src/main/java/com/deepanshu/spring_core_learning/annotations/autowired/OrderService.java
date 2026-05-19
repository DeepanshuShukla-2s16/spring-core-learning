package com.deepanshu.spring_core_learning.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * Main service class demonstrating
 * different types of @Autowired injection.
 */
public class OrderService {

    /*
     * =====================================
     * Property Injection
     * =====================================
     * 
     * Spring injects dependency directly into field/property.
     */
    @Autowired
    private PaymentService paymentService;

    private NotificationService notificationService;

    private InvoiceService invoiceService;

    /*
     * =====================================
     * Setter Injection
     * =====================================
     * 
     * Spring injects dependency using setter method.
     */
    @Autowired
    public void setNotificationService(NotificationService notificationService) {
    	System.out.println("Setter injection called.");
        this.notificationService = notificationService;
    }

    /*
     * =====================================
     * Constructor Injection
     * =====================================
     * 
     * Spring injects dependency through constructor parameter.
     */
    @Autowired
    public OrderService(InvoiceService invoiceService) {

        System.out.println("Constructor injection called.");

        this.invoiceService = invoiceService;
    }

    /*
     * Business method.
     */
    public void placeOrder() {

        System.out.println("Order placed successfully.\n");

        paymentService.makePayment();

        notificationService.sendNotification();

        invoiceService.generateInvoice();
    }
}