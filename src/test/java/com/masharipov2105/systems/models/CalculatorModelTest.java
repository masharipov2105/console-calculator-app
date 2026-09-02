package com.masharipov2105.systems.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorModelTest{

	@Test
	void testCreateObject(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		assertEquals(model.toString(), "12.000 + 15.400");
	}

    // =========================== getters ==============================
	@Test
	void testGetFirstNumber(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		assertEquals(12.0, model.getFirstNumber());
	}

	@Test
	void testGetCommand(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		assertEquals('+', model.getCommand());
	}

	@Test
	void testGetSecondNumber(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		assertEquals(15.4, model.getSecondNumber());
	}

	//=========================== setters ===============================

	@Test
	void testSetFirstNumber(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		model.setFirstNumber(20.5);
		assertEquals(20.5, model.getFirstNumber());
	}

	@Test
	void testSetCommand(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		model.setCommand('*');
		assertEquals('*', model.getCommand());
	}

	@Test
	void testSetSecondNumber(){

		CalculatorModel model = new CalculatorModel(12.0, '+', 15.4);
		model.setSecondNumber(22.5);
		assertEquals(22.5, model.getSecondNumber());
	}

}