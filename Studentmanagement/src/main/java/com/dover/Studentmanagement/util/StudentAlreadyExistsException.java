package com.dover.Studentmanagement.util;

public class StudentAlreadyExistsException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentAlreadyExistsException(String msg)
	{
		super(msg);
	}

}
