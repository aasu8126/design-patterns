package com.interview.dp.prototype;

public class Client {
	public static void main(String[] args) {
		
		Registory registory = new Registory();
		
		Student student = (Student)registory.createItem("student");
		student.setName("Ding ding");
		System.out.println(student);
		
		Employee employee = (Employee)registory.createItem("employee");
		employee.setName("Sin chu");
		System.out.println(employee);
	}
}
