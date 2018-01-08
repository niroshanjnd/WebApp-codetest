package com.janaka.codetest.starter.department;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.janaka.codetest.starter.employee.Employee;

@Entity
public class Department {

	@Id
	private String departmentid;
	private String departmentname;
	@OneToOne(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Employee employee;
	
	public Department() {
	}

	public Department(String id, String departmentname, Employee employee) {
		super();
		this.departmentid = id;
		this.departmentname = departmentname;
		this.employee = employee;
	}
	
	public String getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	
	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
