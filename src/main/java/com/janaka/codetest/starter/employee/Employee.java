package com.janaka.codetest.starter.employee;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.janaka.codetest.starter.department.Department;

@Entity
public class Employee {
	
	@Id
	private String employeeid;
	private String firstname;
	private String lastname;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departmentid")
    private Department department;
	
	public Employee() {}
	
	public Employee(String employeeid, String firstname, String lastname, Department department) {
		super();
		this.employeeid = employeeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
	}
	
	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
