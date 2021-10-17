package com.interview.dp.composite2;

public class Manager implements Employee{

	private String name;
	private int id;
	private String position;
	
	public Manager(String name, int id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(this.id +" "+this.name + " " +this.position);
	}

	
}
