package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
//import com.example.demo.empmapst.EmpmapstImpl;
import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	IEmployeeRepository empserv;
	//EmpmapstImpl mape;

	//@Override
	/*public List<Employee> listAllEmp() {
		List<EmployeeDto> allemp=mape.toDto(empserv.findAll());
		if(allemp.isEmpty()) {
			throw new EmployeeNotFoundException("There are no employees");
		}
		return allemp;
	}*/

	@Override
	public void addEmployee(Employee employee) {
		Optional<Employee> opt=empserv.findById(employee.getEmpId());
		if(opt.isPresent()) {
			throw new EmployeeNotFoundException("there is already an employee present with empid "+employee.getEmpId());
		}
		else {
			empserv.save(employee);

		}
		//opt.save(employee);
	}
	@Override
	public List<Employee> listAllEmp() {
		// TODO Auto-generated method stub
		List allemp=empserv.findAll();
		return null;
	}
	
	
}
