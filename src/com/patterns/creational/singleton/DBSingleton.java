package com.patterns.creational.singleton;

public class DBSingleton {

	private static DBSingleton instance = null;

	private DBSingleton() {

	}

	public static DBSingleton getInstance() {
		if (instance == null) {
			synchronized (DBSingleton.class) {
				if (instance == null) {
					instance = new DBSingleton();
				}
			}
		}
		return instance;
	}

}
