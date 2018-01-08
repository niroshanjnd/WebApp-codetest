package com.janaka.codetest.starter.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping("/employee")
	public List<Employee> getAllEmployees() {
		logger.debug("all Employees");
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/employee")
	public void addEmployee(@RequestBody Employee topic) {
		employeeService.addEmployee(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/employee/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String id) {
		logger.debug("update employee");
		employeeService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/employee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
	}

}
