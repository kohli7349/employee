package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

public interface IEmployeeService {

		public List<Employee> listAllEmp();
		public void addEmployee(Employee employee);
}
