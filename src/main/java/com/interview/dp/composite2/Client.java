package com.interview.dp.composite2;

public class Client {

	public static void main(String[] args) {
		
		Employee dev1 = new Developer("Ding chow", 1001, "Developer");
		Employee dev2 = new Developer("Shing chow", 1002, "Developer Lead");
		
		CompanyDirectory devDirectory = new CompanyDirectory();
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);
		
		Employee man1 = new Manager("shw moe", 2001, "Manager");
		Employee man2 = new Manager("Shingle", 2002, "Senior Manager");
		
		CompanyDirectory managerDirectory = new CompanyDirectory();
		managerDirectory.addEmployee(man1);
		managerDirectory.addEmployee(man2);
		
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(devDirectory);
		directory.addEmployee(managerDirectory);
		
		// Print all the directory
		System.out.println("**** Print all employees ****");
		directory.showEmployeeDetails();
		
		directory.removeEmployee(man1);
		System.out.println("**** Print all employees after remove man1 ****");
		directory.showEmployeeDetails();
	}
}
