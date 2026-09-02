package com.masharipov2105.systems.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvalidNumberExceptionTest{

	void testNumberException1() throws InvalidNumberException{

		throw new InvalidNumberException();
	}

	void testNumberException2(String p) throws InvalidNumberException{

		throw new InvalidNumberException(p);
	}

	@Test
	void testExp1(){

		Exception exp = assertThrows(InvalidNumberException.class, ()->{testNumberException1();});
		assertEquals("Invalid number error", exp.getMessage());
	}

	@Test
	void testExp2(){

		Exception exp = assertThrows(InvalidNumberException.class, ()->{testNumberException2("12g");});
		assertEquals("Invalid number: 12g", exp.getMessage());
	}
}