package com.dover.Studentmanagement.domain;

import java.util.Objects;

import com.dover.Studentmanagement.util.InvalidArgument;

public class Student{
	private String studentID;
	private String fullName;
	private int age;
	private String grade;
	private String email;
	
	public Student()
	{
		
	}
	
	public Student(String studentID, String fullName, int age, String grade, String email) {

		setStudentID(studentID);
		setFullName(fullName);
		setAge(age);
		setGrade(grade);
		setEmail(email);
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		if(studentID==null)
			throw new InvalidArgument("Id cannot be null");
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		if(fullName==null)
			throw new InvalidArgument("Name cannot be null");
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<6 || age>30)
			throw new InvalidArgument("Age should be in limit of 6-30");
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if(!grade.matches("A|AA|AB|BB|B|BC|C|CD|D|F"))
			throw new InvalidArgument("Grade should be one of A|AA|AB|BB|B|BC|C|CD|D|F");
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", age=" + age + ", grade=" + grade
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentID == other.studentID;
	}

	
	
	
	
	
	

}
