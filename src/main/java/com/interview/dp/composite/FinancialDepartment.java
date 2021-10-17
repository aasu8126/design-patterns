package com.interview.dp.composite;

public class FinancialDepartment implements Department {

	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printDepartmentNames() {
		System.out.println(this.getClass().getSimpleName());
	}

}
