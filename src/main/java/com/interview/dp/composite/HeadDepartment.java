package com.interview.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

	private Integer id;
	private String name;
	
	private List<Department> childDepartments;
	
	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}
	
	public void addDepartment(Department department)
	{
		childDepartments.add(department);
	}
	
	public void removeDepartment(Department department)
	{
		childDepartments.remove(department);
	}
	
	@Override
	public void printDepartmentNames() {
		// 1. If we add HeadDepartment into child list as well and runs below line of code
		// then it will through exception called - java.lang.StackOverflowError
		// because on each object it will run their own printDepartmentNames method
//		childDepartments.forEach(Department::printDepartmentNames);
		
		// 2. If we add HeadDepartment into child list as well and runs below line of code
		// then it will work fine without falling into exception, it will print all the objects exists
		// in the list
		childDepartments.forEach(ele -> {
			System.out.println(ele);
		});
//		for(Department department : childDepartments)
//		{
//			System.out.println(department);
//		}
	}

}
