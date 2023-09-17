package com.company.pattern.bdp.strategy;

public class ShoppingCartTest {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 10));
        cart.addItem(new Item("5678", 40));

        // pay by paypal
        cart.pay(new PaypalStrategy("no-reply@Codegate.com", "mypwd"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("Saeed Gharibi", "1234567890123456",
                "786", "12/15"));

    }
}
