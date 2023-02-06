package com.global.repository;

import org.springframework.data.repository.CrudRepository;

import com.global.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
