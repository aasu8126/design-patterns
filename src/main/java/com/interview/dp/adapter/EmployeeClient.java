package com.interview.dp.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList()
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee = new EmployeeDB("1001", "joe", "alberato", "joe.alberato@gmail.com");
//		employeeList.add(employee);
		
		// here comes adapter 1
		EmployeeLdap employeeLdap = new EmployeeLdap("1002", "luca", "juyana", "luca.juyana@gmail.com");
//		employeeList.add(new EmployeeLdapAdapter(employeeLdap));
		
		// here comes adapter 2
		EmployeeCSV employeeCSV = new EmployeeCSV("1003,luca,juyana,luca.juyana@gmail.com");
		employeeList.add(new EmployeeAdapterCSV(employeeCSV));
		
		return employeeList;
	}
}
