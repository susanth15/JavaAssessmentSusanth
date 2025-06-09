package com.dover.Studentmanagement.presentation;
import java.util.List;

import com.dover.Studentmanagement.domain.Student;
import com.dover.Studentmanagement.service.*;

public class StudentManagementMain {
	public static void main(String args[])
	{
		StudentService ss = new StudentServiceImpl();
		
		//Add
		try {
		
		ss.addStudent(new Student("U24CS100","Pawan Kumar", 24,"AA","pk100@outlook.com"));
		ss.addStudent(new Student("U24CS103","Hemanth Yenni", 25,"AB","hy103@outlook.com"));
		ss.addStudent(new Student("U24CS105","Ravi Naidu", 23,"A","rn105@outlook.com"));
		
		//ss.addStudent(new Student("U24CS105","Ravi Naidu", 34,"A","rn105@outlook.com")); *throws exception
		
		System.out.println("=============");
		
		//get all
		List<Student> l=ss.getAllStudents();
		for(Student s:l)
			System.out.println(s);
		
		System.out.println("=============");
		
		//filter by grade
		l.stream().filter(s->s.getGrade()=="A"?true:false).forEach(System.out::println);
		
		System.out.println("=============");
		
		//getwithID
		System.out.println((ss.getStudentById("U24CS100")).toString());
		
		System.out.println("=============");
		
		//updateStudent
		Student a = new Student("U24CS100","Pawan Kumar",24,"AB","pk100@outlook.com");
		//ss.updateStudent("U24CS103", a); //throws exception
		ss.updateStudent("U24CS100", a); 
		
		System.out.println("=============");
		
		//deleteStudent
		ss.deleteStudent("U24CS105");
		
		System.out.println("=============");
		
		//ss.deleteStudent("U24CS99"); //throws exception
		
		List<Student> m =ss.getAllStudentsSorted();
		for(Student s:m)
			System.out.println(s);
		
		System.out.println("=============");
	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}

}
