package com.masharipov2105.systems.models;

public class CalculatorModel{

	//fields
	private String firstNumber;
	private String secondNumber;
	private char command;

	// constructor
	public CalculatorModel(String firstNumber, String secondNumber, char command){
        //initialize
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.command = command;
	}

	//getters
	public String getFirstNumber(){

		return this.firstNumber;
	}

	public char getCommand(){

		return this.command;
	}

	public String getSecondNumber(){

		return this.secondNumber;
	}

	//setters
	public void setFirstNumber(String newNumber){

		this.firstNumber = newNumber;
	}

	public void setCommand(char newCommand){

		this.command = newCommand;
	}

	public void setSecondNumber(String newNumber){

		this.secondNumber = newNumber;
	}

	// overriding toString method
	@Override
	public String toString(){

		String finalString = String.format("%s %c %s", this.firstNumber, this.command, this.secondNumber);
		return finalString;
	}
}