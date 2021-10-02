package com.interview.dp.prototype;

public class Student extends PersonPrototype{
	String collegeId;
	
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	
	@Override
	public String toString() {
		return "NAME :: " + this.name + ", COLLEGE ID :: " +this.collegeId + ", AGE :: "+ this.age;
	}
}
