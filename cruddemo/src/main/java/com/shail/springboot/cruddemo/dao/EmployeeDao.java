package com.shail.springboot.cruddemo.dao;

import java.util.List;

import com.shail.springboot.cruddemo.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAll();

}
