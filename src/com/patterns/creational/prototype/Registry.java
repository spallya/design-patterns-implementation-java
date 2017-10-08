package com.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Sample Movie");
		movie.setPrice(24.99);
		movie.setRunTime("2 hours");
		movie.setUrl("example.com");
		items.put("Movie", movie);

		Book book = new Book();
		book.setTitle("Sample Book");
		book.setPrice(10.99);
		book.setNumberOfPages(100);
		book.setUrl("example.com");
		items.put("Book", book);
	}

}
