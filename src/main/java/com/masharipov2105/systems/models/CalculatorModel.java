package com.masharipov2105.systems.models;

public class CalculatorModel{

	//fields
	private double firstNumber;
	private double secondNumber;
	private char command;

	// constructor
	public CalculatorModel(double firstNumber, char command, double secondNumber){
        //initialize
		this.firstNumber = firstNumber;
		this.command = command;
		this.secondNumber = secondNumber;
	}

	//getters
	public double getFirstNumber(){

		return this.firstNumber;
	}

	public char getCommand(){

		return this.command;
	}

	public double getSecondNumber(){

		return this.secondNumber;
	}

	//setters
	public void setFirstNumber(double newNumber){

		this.firstNumber = newNumber;
	}

	public void setCommand(char newCommand){

		this.command = newCommand;
	}

	public void setSecondNumber(double newNumber){

		this.secondNumber = newNumber;
	}

	// overriding toString method
	@Override
	public String toString(){

		String finalString = String.format("%.3f %c %.3f", this.firstNumber, this.command, this.secondNumber);
		return finalString;
	}
}