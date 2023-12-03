package com.company.pattern.cdp.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PaymentGatewayFactory factory = new PaypalGatewayFactory();
        PaymentGateway gateway = factory.createPaymentGateway();

        // assuming payment is created
        Payment payment = new Payment();
        gateway.processPayment(payment);
    }
}
