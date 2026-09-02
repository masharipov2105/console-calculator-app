package com.masharipov2105.systems.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionByZeroExceptionTest{

	void test1() throws DivisionByZeroException{

		throw new DivisionByZeroException();
	}

	void test2(String p) throws DivisionByZeroException{

		throw new DivisionByZeroException(p);
	}


	@Test
	void testDivisionByZeroException1(){

		Exception exp = assertThrows(DivisionByZeroException.class, ()->{test1();});
		assertEquals("Division by zero is not possible.", exp.getMessage());
	}

	@Test
	void testDivisionByZeroException2(){

		Exception exp = assertThrows(DivisionByZeroException.class, ()->{test2("xyz");});
		assertEquals("xyz", exp.getMessage());
	}
}