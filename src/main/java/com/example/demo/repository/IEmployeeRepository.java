package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select * from employee;", nativeQuery=true)
	List<Employee> getAllEmp();

}
