package com.dover.Studentmanagement.service;


import java.util.List;


import com.dover.Studentmanagement.domain.Student;


public interface StudentService {

	 public void addStudent(Student s) ;
	 
	 public List<Student> getAllStudents();
	 
	 public Student getStudentById(String Id);
	 
	 public void updateStudent(String Id, Student updatedStudent);
	 
	 public void deleteStudent(String Id);
	 
	 public List<Student> getAllStudentsSorted();
	 
	 
	
}
