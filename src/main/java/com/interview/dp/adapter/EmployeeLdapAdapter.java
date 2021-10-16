package com.interview.dp.adapter;

public class EmployeeLdapAdapter implements Employee {

	private EmployeeLdap employeeLdap;
	public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
		this.employeeLdap = employeeLdap;
	}
	
	@Override
	public String getId() {
		return employeeLdap.getCn();
	}

	@Override
	public String getFirstName() {
		return employeeLdap.getGivenName();
	}

	@Override
	public String getLastName() {
		return employeeLdap.getSurname();
	}

	@Override
	public String getEmail() {
		return employeeLdap.getMail();
	}

	@Override
	public String toString() {
		return  employeeLdap +"";
	}

}
