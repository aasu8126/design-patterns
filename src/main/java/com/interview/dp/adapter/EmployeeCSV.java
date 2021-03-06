package com.interview.dp.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if(tokenizer.hasMoreElements())
			id = Integer.parseInt(tokenizer.nextToken());
		if(tokenizer.hasMoreElements())
			firstName = tokenizer.nextToken();
		if(tokenizer.hasMoreElements())
			lastName = tokenizer.nextToken();
		if(tokenizer.hasMoreElements())
			emailAddress = tokenizer.nextToken();
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "EmployeeCSV [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + "]";
	}
}
