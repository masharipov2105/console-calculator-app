package com.masharipov2105.systems;

//imports
import com.masharipov2105.systems.service.CalculatorService;
import com.masharipov2105.systems.exceptions.*;
import com.masharipov2105.systems.models.CalculatorModel;
import com.masharipov2105.systems.utils.InputValidator;
import java.util.Scanner;

public class App{

	//fields
	private CalculatorService cs;
	private Scanner scanner;
	private CalculatorModel cm;
	private boolean isRun = true;

	private String banner = 
		"\n==================================\n" +
		"==    Console Calculator App    ==\n" +
		"==================================\n";

	//constructor
	public App(CalculatorService calculatorService){

		this.cs = calculatorService;
		this.cm = new CalculatorModel("", "", ' ');
		this.scanner = new Scanner(System.in);
	}

	// methods
	public void run() throws CalculatorException{

		System.out.println(this.banner);
		String num1 = "";
		String num2 = "";
		String command = "";

		while(this.isRun){

			try{

				System.out.print("enter number 1: ");
				num1 = this.scanner.nextLine();
				if (InputValidator.isExit(num1)){
					isRun = false;
					System.out.println("\nGoodbye");
					break;
				}
				System.out.print("enter number 2: ");
				num2 = this.scanner.nextLine();
				if (InputValidator.isExit(num2)){
					isRun = false;
					System.out.println("\nGoodbye");
					break;
				}
				System.out.print("enter command(+, -, *, /): ");
				command = this.scanner.nextLine();
				if (InputValidator.isExit(command)){
					isRun = false;
					System.out.println("\nGoodbye");
					break;
				}
				InputValidator.parseCommand(command);

				this.cm.setFirstNumber(num1);
				this.cm.setSecondNumber(num2);
				this.cm.setCommand(command.charAt(0));

				System.out.println(this.cm + " = " + this.cs.calculate(this.cm));
				toAsk();

			} catch(InvalidNumberException e){

				System.out.println(e.getMessage());
				toAsk();
			} catch(InvalidCommandException e){

				System.out.println(e.getMessage());
				toAsk();
			} catch(DivisionByZeroException e){

				System.out.println(e.getMessage());
				toAsk();
			} catch(CalculatorException e){

				System.out.println(e.getMessage());
				toAsk();
			} catch (Exception e){

				System.out.println(e.getMessage());
			}
		}
	}

	private void toAsk() throws NullPointerException{

		System.out.print("\nDo you want to continue? (yes/no): ");
		String answer = this.scanner.nextLine();

		try{

			if (InputValidator.isYes(answer)){
				this.isRun = true;
			} else if (InputValidator.isNo(answer)){
				this.isRun = false;
				System.out.println("\nGoodbye");
			} else{
				toAsk();
			}
		} catch(NullPointerException e){

			System.out.println(e.getMessage());
		}
	}
}