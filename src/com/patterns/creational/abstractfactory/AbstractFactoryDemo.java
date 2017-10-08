package com.patterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(700);
		CreditCard card1 = factory.getCreditCard(CardType.PLATINUM);
		System.out.println(card1.getClass());
		factory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = factory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}

}
