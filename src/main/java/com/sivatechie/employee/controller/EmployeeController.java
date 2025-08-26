package com.sivatechie.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivatechie.employee.model.Employee;
import com.sivatechie.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

@Autowired
private EmployeeRepository employeeRepository;

@PostMapping
@RequestMapping("/save")
public Employee saveEmployee(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
}

@GetMapping
@RequestMapping("/list")
public List<Employee> getAllEmployee(){
	return employeeRepository.findAll();
}
}
