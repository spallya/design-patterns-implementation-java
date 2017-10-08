package com.patterns.creational.factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemtPage());
		pages.add(new SearchPage());
	}

}
