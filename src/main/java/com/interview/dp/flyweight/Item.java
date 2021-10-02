package com.interview.dp.flyweight;

public class Item {

	private String name;

	public Item(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
