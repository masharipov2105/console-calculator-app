package com.masharipov2105.systems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest{

	private Calculator calculator;

	@BeforeEach
	void setUp(){

		calculator = new Calculator();
	}

	@Test
	void testAdd(){

		int a = 4;
		int b = 6;

		int result = 10;

		int actual = calculator.add(a, b);

		assertEquals(result, actual, "4 + 6 = 10");
	}
}