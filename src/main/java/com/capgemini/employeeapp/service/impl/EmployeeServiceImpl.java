package com.capgemini.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeapp.entities.Employee;
import com.capgemini.employeeapp.repository.EmployeeRepository;
import com.capgemini.employeeapp.service.EmployeeServices;
@Service
public class EmployeeServiceImpl implements EmployeeServices{
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		return employeeRepository.deleteEmployee(employeeId);
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		
		return employeeRepository.findEmployee(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAllEmployees();
	}

	
	

}
