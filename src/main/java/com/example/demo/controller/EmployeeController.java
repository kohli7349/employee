package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.empmap.empMapper;
import com.example.demo.entity.Employee;
//import com.example.demo.empmapst.Empmapst;
//import com.example.demo.entity.Employee;
import com.example.demo.repository.IEmployeeRepository;
import com.example.demo.service.IEmployeeService;

@RestController
public class EmployeeController {

	final static Logger LOGGER=LogManager.getLogger(EmployeeController.class);
	
	
	@Autowired
	empMapper empmap;
	@Autowired
	IEmployeeService empserv;
	@Autowired
	IEmployeeRepository empr;
	
	@GetMapping("/employee/all")
	public List<Employee> listAllEmp(){
		LOGGER.info("fetching all employee delails by get mapping...");
		List<Employee> empList=empr.findAll();

		return empList;
	}
	
	@PostMapping("/employee")
	public void addEmployee(@Valid @RequestBody EmployeeDto employeedto){
		LOGGER.info("adding employee details by using post mapping...");
		empserv.addEmployee(empmap.toEmp(employeedto));
		
	}
}
