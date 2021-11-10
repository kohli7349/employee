package com.example.demo.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EmployeeDto {
	
	public EmployeeDto(int empId,
			@NotEmpty @Size(min = 3, max = 10, message = "name should not be empty") String empName,
			@NotEmpty @Pattern(regexp = "(0/91)?[7-9][0-9]{9}", message = "Employee mobile number must be valid") String contactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.contactNumber = contactNumber;
	}

	public EmployeeDto() {
		super();
	}

	private int empId;
	
	@NotEmpty
	@Size(min=3,max=10,message="name should not be empty")
	private String empName;
	
	@NotEmpty
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Employee mobile number must be valid")
	private String contactNumber;

}
