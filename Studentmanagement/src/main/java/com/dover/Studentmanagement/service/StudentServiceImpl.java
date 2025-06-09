package com.dover.Studentmanagement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.dover.Studentmanagement.domain.Student;
import com.dover.Studentmanagement.util.StudentAlreadyExistsException;
import com.dover.Studentmanagement.util.StudentNotFoundException;
import com.dover.Studentmanagement.util.*;

public class StudentServiceImpl implements StudentService{
	
	private Map<String,Student> studentRec;
	
	public StudentServiceImpl()
	{
		studentRec = new HashMap<>();
	}
	

	@Override
	public void addStudent(Student s) {
		if(studentRec.containsKey(s.getStudentID()))
		{
			throw new StudentAlreadyExistsException("Student with ID: "+s.getStudentID()+" already exists");
		}
		
		studentRec.put(s.getStudentID(), s);
		
		System.out.println("Student added with ID: "+s.getStudentID());
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> l = new ArrayList<>(studentRec.values());
		
		return l;
	}

	@Override
	public Student getStudentById(String Id) {
		
		// TODO Auto-generated method stub
		if(!studentRec.containsKey(Id))
		{
			throw new StudentNotFoundException("Student with specified ID "+Id+" is not found in records");
		}
		return studentRec.get(Id);
	}

	@Override
	public void updateStudent(String Id, Student updatedStudent) {
		// TODO Auto-generated method stub
		if(!studentRec.containsKey(Id))
		{
			throw new StudentNotFoundException("Student with specified ID "+Id+" is not found in records for updating");
		}
		Student currentStudent = studentRec.get(Id);
		if(!currentStudent.equals(updatedStudent))
			throw new StudentNotFoundException("Student with specified ID "+Id+" is not matching to UpdatedStudent ID");
		currentStudent.setAge(updatedStudent.getAge());
		currentStudent.setFullName(updatedStudent.getFullName());
		currentStudent.setEmail(updatedStudent.getEmail());
		currentStudent.setGrade(updatedStudent.getGrade());
		
		System.out.println("Details of Student with ID: "+Id+" are updated");
	}

	@Override
	public void deleteStudent(String Id) {
		// TODO Auto-generated method stub
		if(!studentRec.containsKey(Id))
		{
			throw new StudentNotFoundException("Student with specified ID "+Id+" is not found in records for deletion");
		}
		
		studentRec.remove(Id);
		
		System.out.println("Student with ID "+Id+" is deleted");
	}


	@Override
	public List<Student> getAllStudentsSorted() {
		// TODO Auto-generated method stub
		
		List<Student> s = new ArrayList<>(studentRec.values());
		Collections.sort(s, new Namesort());
		return s;
	}

}
