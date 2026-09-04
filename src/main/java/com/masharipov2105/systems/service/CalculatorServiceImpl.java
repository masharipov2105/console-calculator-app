package com.masharipov2105.systems.service;

import com.masharipov2105.systems.models.CalculatorModel;
import com.masharipov2105.systems.exceptions.*;
import com.masharipov2105.systems.utils.InputValidator;

public class CalculatorServiceImpl implements CalculatorService{

	//constructor
	public CalculatorServiceImpl(){}

	//method overriding
	@Override
	public double calculate(CalculatorModel model) throws CalculatorException{

		double result = 0.0;
		double num1 = InputValidator.parseNumber(model.getFirstNumber());
		double num2 = InputValidator.parseNumber(model.getSecondNumber());

		switch (InputValidator.parseCommand(String.valueOf(model.getCommand()))){

			case '+':

				result = (num1 + num2);
				break;
			case '-':

				result = (num1 - num2);
				break;
			case '*':

				result = (num1 * num2);
				break;
			case '/':

				if (num2 == 0.0){

					throw new DivisionByZeroException();
				}

				result = (num1 / num2);
				break;
		}
		result = Double.parseDouble(String.format("%.3f", result));
		return result;
	}
}