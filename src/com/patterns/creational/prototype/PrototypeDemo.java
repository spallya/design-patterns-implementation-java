package com.patterns.creational.prototype;

public class PrototypeDemo {

	public static void main(String args[]) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("My first movie");
		
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getRunTime());
		System.out.println(movie.getPrice());
		System.out.println(movie.getUrl());
		
		Movie movie2 = (Movie) registry.createItem("Movie");
		movie2.setTitle("My second movie");
		
		System.out.println(movie2);
		System.out.println(movie2.getTitle());
		System.out.println(movie2.getRunTime());
		System.out.println(movie2.getPrice());
		System.out.println(movie2.getUrl());
	}

}
