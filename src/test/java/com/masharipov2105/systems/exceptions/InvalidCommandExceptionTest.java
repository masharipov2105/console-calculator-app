package com.masharipov2105.systems.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvalidCommandExceptionTest{

	void test1() throws InvalidCommandException{

		throw new InvalidCommandException();
	}

	void test2(String p) throws InvalidCommandException{

		throw new InvalidCommandException(p);
	}

	@Test
	void testInvalidCommandException1(){

		Exception exp = assertThrows(InvalidCommandException.class, ()->{test1();});
		assertEquals("Invalid command, command not found !", exp.getMessage());
	}

	@Test
	void testInvalidCommandException2(){

		Exception exp = assertThrows(InvalidCommandException.class, ()->{test2("xyz");});
		assertEquals("xyz command not found !", exp.getMessage());
	}

}