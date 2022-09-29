package com.demo.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webapp.entity.Employees;
import com.demo.webapp.service.EmployeesService;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeesService empService;
	
	@PostMapping("/emp")
	public ResponseEntity<Employees> saveEmployees(@RequestBody Employees employees){
		return new ResponseEntity<Employees>(empService.saveEmployees(employees), HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/findById")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		return null;
	}
}
