package com.patterns.structural.flyweight;

public class Order {

	public final int orderNumber;
	public final Item item;

	public Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}

	public void processOrder() {
		System.out.println("Ordering " + item + "for order number " + orderNumber);
	}

}
