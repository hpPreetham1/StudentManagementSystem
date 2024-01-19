package com.jsp.studentmanagementsystem.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.studentmanagementsystem.dto.MessageData;
import com.jsp.studentmanagementsystem.dto.StudentRequest;
import com.jsp.studentmanagementsystem.dto.StudentResponse;
import com.jsp.studentmanagementsystem.entity.Student;
import com.jsp.studentmanagementsystem.util.ResponseStructure;

import jakarta.mail.MessagingException;

public interface StudentService {
	
	public ResponseEntity<ResponseStructure<StudentResponse>> saveStudent(StudentRequest student);
	
	public ResponseEntity<ResponseStructure<StudentResponse>> updateStudent(StudentRequest studentRequest,int StudentId);
	
	public ResponseEntity<ResponseStructure<Student>> deleteStudent(int studentId);
	
	public ResponseEntity<ResponseStructure<StudentResponse>>  findStudentbyId(int studentId);
	
	public ResponseEntity<ResponseStructure<List<StudentResponse>>> findAllStudent();
	
	public ResponseEntity<ResponseStructure<StudentResponse>>  findStudentbyEmail(String studentEmail);
	
	public ResponseEntity<ResponseStructure<StudentResponse>>  findStudentByPhNo(long studentPhno);
	
	public ResponseEntity<ResponseStructure<List<String>>> getAllEmailsByGrade(String grade);
	
	public ResponseEntity<String> extractDataFromExcel(MultipartFile file) throws IOException;
	
	public ResponseEntity<String> writeToExcel (String filePath) throws IOException;
	
	public ResponseEntity<String> extractDataFromCsv(MultipartFile file) throws IOException;
	
	public ResponseEntity<String> sendMail(MessageData messageData);
	
	public ResponseEntity<String> sendMimeMessage(MessageData meesagedata) throws MessagingException;

	
	
}
