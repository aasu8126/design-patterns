package com.interview.dp.composite2;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

	// Not looks that much good example but ok
	
	List<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee)
	{
//		employees.remove(employee);
		for(Employee employee2 : employees)
		{
			if(employee2 instanceof CompanyDirectory) {
				CompanyDirectory cd = (CompanyDirectory)employee2;
				cd.employees.remove(employee);
			}
		}
	}
	
	@Override
	public void showEmployeeDetails() {
		employees.forEach(Employee::showEmployeeDetails);
	}

}
