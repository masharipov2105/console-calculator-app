package com.masharipov2105.systems.utils;

import com.masharipov2105.systems.exceptions.*;

public final class InputValidator{

	//constructor is private
	private InputValidator(){

		throw new UnsupportedOperationException("Utility class");
	}

	//parsing number method
	public static double parseNumber(String number) throws InvalidNumberException, NullPointerException{

		if (number == null || number.trim().isEmpty()){

			throw new NullPointerException("The number cannot be null or empty");
		}
		try{

			return Double.parseDouble(number.trim());
		} catch(NumberFormatException e){

			throw new InvalidNumberException(number.trim());
		}
	}

	//parsing command method
	public static char parseCommand(String command) throws NullPointerException, InvalidCommandException{

		final char[] commands = {'+', '-', '*', '/'}; 
		if (command == null || command.trim().isEmpty()){

			throw new NullPointerException("The command cannot be null or empty");
		}
		if (command.trim().length() > 1){

			throw new InvalidCommandException(command.trim());
		}
		for (char i: commands){

			if (command.charAt(0) == i){

				return command.charAt(0);
			}
		}
		throw new InvalidCommandException(command.trim());
	}

	//isYes method

	public static Boolean isYes(String command) throws NullPointerException {

		if (command == null || command.trim().isEmpty()){

			throw new NullPointerException("The command cannot be null or empty");
		}

		return (command.equals("yes") || command.equals("y"));
	}

	//isNo method
	public static Boolean isNo(String command) throws NullPointerException {

		if (command == null || command.trim().isEmpty()){

			throw new NullPointerException("The command cannot be null or empty");
		}

		return (command.equals("no") || command.equals("n"));
	}

	//isExit command method
	public static Boolean isExit(String command) throws NullPointerException {

		if (command == null || command.trim().isEmpty()){

			throw new NullPointerException("The command cannot be null or empty");
		}

		return (command.equals("exit") || command.equals("quit"));
	}
}