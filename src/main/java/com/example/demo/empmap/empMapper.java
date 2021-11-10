package com.example.demo.empmap;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

@Mapper(
	    componentModel = "spring"
	)

public interface empMapper{
EmployeeDto toDto(Employee employee);
Employee toEmp(EmployeeDto employeedto);
List<EmployeeDto> toDto(List<Employee> employee);

}
