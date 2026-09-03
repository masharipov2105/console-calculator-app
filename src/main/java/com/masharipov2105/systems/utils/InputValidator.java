package com.masharipov2105.systems.utils;

import com.masharipov2105.systems.exceptions.*;

public final class InputValidator{

	//constructor is private
	private InputValidator(){

		throw new UnsupportedOperationException("Utility class");
	}


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
}