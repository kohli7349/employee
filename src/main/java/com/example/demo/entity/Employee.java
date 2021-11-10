package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//import org.checkerframework.common.aliasing.qual.Unique;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
	
	


	public Employee() {
		super();
	}


	public Employee(int empId, @NotEmpty @Size(min = 3, max = 10, message = "name should not be empty") String empName,
			@NotEmpty @Pattern(regexp = "(0/91)?[7-9][0-9]{9}", message = "Employee mobile number must be valid") String contactNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.contactNumber = contactNumber;
	}


	@Id
	private int empId;
	
	@Column(name="empName")
	//@NotEmpty
	//@Size(min=3,max=10,message="name should not be empty")
	private String empName;
	
	@Column(name="conatact_number")
	//@NotEmpty
	//@Unique
	@Pattern(regexp="(0/91)?[7-9][0-9]{9}",message="Employee mobile number must be valid")
	private String contactNumber;


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}
