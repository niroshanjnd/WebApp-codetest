package com.janaka.codetest.starter.employee;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
