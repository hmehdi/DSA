package com.company.pattern.cdp.FactoryMethod;

public class StripeGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new StripeGateway();
    }
}
