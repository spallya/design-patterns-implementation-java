package com.patterns.creational.builder;

public class BuilderLunchOrderDemo {
	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		LunchOrder order = builder.bread("Wheat")
								  .condiments("Lettuce")
								  .dressing("Mayo")
								  .meat("Turkey")
								  .build();
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
	}

}
