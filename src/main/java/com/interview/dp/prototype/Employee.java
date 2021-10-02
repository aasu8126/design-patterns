package com.interview.dp.prototype;

public class Employee extends PersonPrototype{

	String empId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "NAME :: " + this.name + ", EMPLOYEE ID :: " +this.empId + ", AGE :: "+ this.age;
	}
}
