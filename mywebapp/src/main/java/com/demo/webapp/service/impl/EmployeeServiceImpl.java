package com.demo.webapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.webapp.entity.Employees;
import com.demo.webapp.repository.EmployeeRepository;
import com.demo.webapp.service.EmployeesService;

@Service
public class EmployeeServiceImpl implements EmployeesService{

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employees saveEmployees(Employees employees) {
		return empRepo.save(employees);
	}
}
