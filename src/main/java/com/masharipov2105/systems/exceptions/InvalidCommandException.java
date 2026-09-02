package com.masharipov2105.systems.exceptions;

public class InvalidCommandException extends CalculatorException{

	public InvalidCommandException(){

		super("Invalid command, command not found !");
	}

	//overloading
	public InvalidCommandException(String message){

		super(String.format("%s command not found !", message));
	}
}