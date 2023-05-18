package com.cico.exception;

public class StudentNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6009545627475001520L;

	public StudentNotFoundException() {
		super();
	}

	public StudentNotFoundException(String message) {
		super(message);
		
	}
}
