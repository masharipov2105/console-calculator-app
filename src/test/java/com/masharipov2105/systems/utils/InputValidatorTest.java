package com.masharipov2105.systems.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.masharipov2105.systems.exceptions.*;

public class InputValidatorTest{

	@Test
	void testParseNumberSuccess() throws InvalidNumberException, NullPointerException{

		assertEquals(12.5, InputValidator.parseNumber("12.5"));
	}

	@Test

	void testParseNumberNullValue() throws InvalidNumberException, NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.parseNumber(null);});
		assertEquals("The number cannot be null or empty", exp.getMessage());
	}

	@Test
	void testParseNumberEmptyValue() throws InvalidNumberException, NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.parseNumber("");});
		assertEquals("The number cannot be null or empty", exp.getMessage()); 
	}

	@Test
	void testParseNumberInvalidNumber(){

		Exception exp = assertThrows(InvalidNumberException.class, ()->{InputValidator.parseNumber("   125g ");});
		assertEquals("Invalid number: 125g", exp.getMessage());
	}
}