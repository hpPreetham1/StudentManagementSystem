package com.jsp.studentmanagementsystem.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StudentRequest {
	@NotNull(message = "Name cannot be null")
	private String studentName;
	@NotBlank(message = "Email cannot be blank")
	@Email(regexp = "[a-zA-Z0-9+_.-]+@[g][m][a][i][l]+.[c][o][m]", 
	            message = "invalid email--Should be in the extension of '@gmail.com' ")
	private String studentEmail;
	@Min(value = 6000000000l, message = "Phone Number cannot start below '6' !!")
	@Max(value = 9999999999l, message = "Phone Number cannot be above '9999999999'!!!")
	private long studentPhNo;
	private String studentGrade;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", 
			message = "8 characters mandatory(1 upperCase,1 lowerCase,1 special Character,1 number)") 
	private String studentPassword;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhNo() {
		return studentPhNo;
	}

	public void setStudentPhNo(long studentPhNo) {
		this.studentPhNo = studentPhNo;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

}

/*
 * ---------- to validate Email -------------\

	@Email(regexp = "[a-zA-Z0-9+_.-]+@[g][m][a][i][l]+.[c][o][m]", message = "invalid email--Should be in the extension of '@gmail.com' ")



-------------- to validate Password -----------------


	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "8 characters mandatory(1 upperCase,1 lowerCase,1 special Character,1 number)") 
*/
