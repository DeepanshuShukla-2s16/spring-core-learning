package com.deepanshu.spring_core_learning.autowiring.constructor;

/*
 * Dependency bean class.
 * 
 * Represents payment processing system.
 */
public class PaymentGateway {

    private String providerName;
    private String transactionMode;

    /*
     * Setter method for provider name.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /*
     * Setter method for transaction mode.
     */
    public void setTransactionMode(String transactionMode) {
        this.transactionMode = transactionMode;
    }

    @Override
    public String toString() {

        return "PaymentGateway [providerName=" + providerName +
                ", transactionMode=" + transactionMode + "]";
    }
}