package com.example.demo.entity;

import java.util.Date;

import lombok.Data;
@Data
public class ValidEmployeeErrorResponse {

	private int status;
	private String message;
	private Date timeStamp;
	private String details;
	public ValidEmployeeErrorResponse() {
		super();
	}
	public ValidEmployeeErrorResponse(int status, String message, Date timeStamp, String details) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
		this.details = details;
	}
	@Override
	public String toString() {
		return "ValidEmployeeErrorResponse [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp
				+ ", details=" + details + "]";
	}
	
}
