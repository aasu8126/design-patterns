package com.interview.dp.composite;

public class Client {

	public static void main(String[] args) {
		
		FinancialDepartment financialDepartment = new FinancialDepartment();
		financialDepartment.setId(1001); financialDepartment.setName("Financial Department");
		
		Department salesDepartment = new SalesDepartment(1002, "Sales Department");
		
		HeadDepartment headDepartment = new HeadDepartment(1004, "Head Department");
		headDepartment.addDepartment(headDepartment);
		headDepartment.addDepartment(financialDepartment);
		headDepartment.addDepartment(salesDepartment);
		
		System.out.println("**** Printing Departments ****");
		headDepartment.printDepartmentNames();
		
		headDepartment.removeDepartment(salesDepartment);
		
		System.out.println("**** Printing Departments ****");
		headDepartment.printDepartmentNames();
	}
}
