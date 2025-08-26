package com.sivatechie.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sivatechie.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
