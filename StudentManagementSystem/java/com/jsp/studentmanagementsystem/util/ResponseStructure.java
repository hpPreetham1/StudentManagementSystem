package com.jsp.studentmanagementsystem.util;

public class ResponseStructure<T> { 
	
	private int status;
	private String message;
	private T data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	// natesh kc   5.09 am 17-03-1990
	// pooja hs  6.30 am 3-12-1995
	

}
