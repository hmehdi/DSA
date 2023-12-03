package com.company.pattern.cdp.FactoryMethod;

public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing Payment via Stripe");
    }
}
