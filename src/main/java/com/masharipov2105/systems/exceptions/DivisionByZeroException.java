package com.masharipov2105.systems.exceptions;

public class DivisionByZeroException extends CalculatorException{

	public DivisionByZeroException(){

		super("Division by zero is not possible.");
	}

	//overloading
	public DivisionByZeroException(String message){

		super(message);
	}
}