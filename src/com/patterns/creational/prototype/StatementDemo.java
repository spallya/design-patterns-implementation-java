package com.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "SELECT * FROM MOVIES WHERE TITLE = ?";
		List<String> parameters = new ArrayList<String>();
		parameters.add("Star Wars");
		Record record = new Record();
		Statement firstStatement = new Statement(sql, parameters, record);
		System.out.println(firstStatement.getSql());
		System.out.println(firstStatement.getParameters());
		System.out.println(firstStatement.getRecord());

		Statement secondStatement = firstStatement.clone();
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
	}

}
