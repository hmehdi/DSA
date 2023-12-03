package com.company.pattern.cdp.FactoryMethod;

public class PaypalGatewayFactory extends PaymentGatewayFactory {
    @Override
    public PaymentGateway createPaymentGateway() {
        return new PaypalGateway();
    }
}
