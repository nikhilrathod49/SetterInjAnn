package com.spring.student;

public class StudentService {
	
	private StudentDetails studentDetails;

	// Constructor Injection
	public StudentService(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public void displayStudentInfo() {
		studentDetails.display();
	}
}