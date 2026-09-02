package com.masharipov2105.systems.exceptions;

public class InvalidNumberException extends CalculatorException{

	public InvalidNumberException(String message){

		super(String.format("Invalid number: %s", message));
	}

	//overloading
	public InvalidNumberException(){

		super("Invalid number error");
	}
}