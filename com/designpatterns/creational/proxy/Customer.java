package com.designpatterns.creational.proxy;

public class Customer {
    public static void main(String[] args) {
        BankAccount creditCard = new CreditCard();
        creditCard.withdraw("5000");

    }
}
