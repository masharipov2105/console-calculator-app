package com.masharipov2105.systems.controller;

import com.masharipov2105.systems.models.CalculatorModel;
import com.masharipov2105.systems.service.CalculatorService;
import com.masharipov2105.systems.utils.InputValidator;
import com.masharipov2105.systems.exceptions.CalculatorException;

import java.util.Scanner;


public class CalculatorController{

	//fields
	private Scanner scanner;
	private CalculatorService service;
	private CalculatorModel model;

	private boolean run = true;

	private String banner = "\n=========================================\n" +
	                        "==        Console Calculator App       ==\n" +
	                        "=========================================\n";

	//constructor
	public CalculatorController(CalculatorService service){

		this.service = service;
		this.scanner = new Scanner(System.in);
		this.model = new CalculatorModel("", "", ' ');  //first initilaize model 
	}

	public void start() throws CalculatorException, NullPointerException{


		System.out.println(banner);

		while(run){

			double num1, num2;
			char command;
			while(true){

				System.out.print("enter first number: ");
				String data = this.scanner.nextLine();

				try{

					num1 = InputValidator.parseNumber(data);
					this.model.setFirstNumber(data);
					break;
				} catch(CalculatorException e){

					System.out.println(e.getMessage());
				} catch(NullPointerException e){

					System.out.println(e.getMessage());
				}
			}

			while(true){

				System.out.print("enter second number: ");
				String data = this.scanner.nextLine();

				try{

					num2 = InputValidator.parseNumber(data);
					this.model.setSecondNumber(data);
					break;
				} catch(CalculatorException e){

					System.out.println(e.getMessage());
				} catch(NullPointerException e){

					System.out.println(e.getMessage());
				}
			}

			while(true){

				System.out.print("enter operator (+ - * /): ");
				String data = this.scanner.nextLine();

				try{

					command = InputValidator.parseCommand(data);
					this.model.setCommand(command);
					break;
				} catch(CalculatorException e){

					System.out.println(e.getMessage());
				} catch(NullPointerException e){

					System.out.println(e.getMessage());
				}
			}

			try{

				System.out.println(String.format("%s %s %s = %s", String.valueOf(num1), String.valueOf(command), String.valueOf(num2), String.valueOf(this.service.calculate(this.model))));
			} catch(CalculatorException e){

				System.out.println(e.getMessage());
			}

			while (true){

				System.out.print("continue ? (yes/no): ");
				String data = this.scanner.nextLine();

				try{

					if (InputValidator.isYes(data)){

						System.out.println("\nContinue OK\n");
						break;
					}

					if (InputValidator.isNo(data)){

						run = false;
						System.out.println("\nGoodbye ...!");
						break;
					}

					continue;
				} catch(NullPointerException e){

					System.out.println(e.getMessage());
				}
			}
		}
	}
}