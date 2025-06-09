package com.dover.Studentmanagement.util;

import java.util.Comparator;

import com.dover.Studentmanagement.domain.Student;

public class Namesort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getFullName().compareTo(o2.getFullName());
	}
	

}
