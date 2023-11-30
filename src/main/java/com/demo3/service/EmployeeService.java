package com.demo3.service;

import java.util.List;

import com.demo3.entity.Employee;
import com.demo3.service.EmployeeService;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
