package com.janaka.codetest.starter.employee;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employee = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}
	
	public Employee getEmployee(String id) {
		return employeeRepository.findOne(id);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.delete(id);
	}
}
