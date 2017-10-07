package com.patterns.structural.flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();
		ims.takeOrder("Earphones", 111);
		ims.takeOrder("TV", 222);
		ims.takeOrder("Earphones", 333);
		ims.takeOrder("Earphones", 444);
		ims.takeOrder("Chair", 555);
		ims.takeOrder("TV", 666);
		ims.takeOrder("TV", 777);
		ims.takeOrder("Earphones", 888);
		ims.takeOrder("Chair", 999);
		
		ims.process();
		
		System.out.println(ims.report());
	}

}
