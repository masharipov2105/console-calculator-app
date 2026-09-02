package com.masharipov2105.systems.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExceptionTest{


	void testCalculator() throws CalculatorException{

		throw new CalculatorException("CalculatorException");
	}

	@Test
	void testException() throws Exception{

		Exception exp = assertThrows(CalculatorException.class, ()->{testCalculator();});
		assertEquals("CalculatorException", exp.getMessage());
	}
}