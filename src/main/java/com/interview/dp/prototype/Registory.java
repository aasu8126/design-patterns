package com.interview.dp.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registory {

	Map<String, PersonPrototype> items = new HashMap<String, PersonPrototype>();
	
	public Registory()
	{
		this.loadItems();
	}

	private void loadItems() {
		Student student = new Student();
		student.setName("dhillon");
		student.setCollegeId("COL1001");
		student.setAge(25);
		items.put("student", student);
		
		Employee employee = new Employee();
		employee.setName("dhillon");
		employee.setEmpId("EMP1001");
		employee.setAge(25);
		items.put("employee", employee);
	}
	
	public PersonPrototype createItem(String itemType)
	{
		PersonPrototype item = null;
		try {
			if(itemType == "student")
			{
				item = (Student)items.get("student").clone();
			}
			else if(itemType == "employee")
			{
				item = (Employee)items.get("employee").clone();
			}
		} catch (CloneNotSupportedException e) {
			
		}
		return item;
	}
	
}
