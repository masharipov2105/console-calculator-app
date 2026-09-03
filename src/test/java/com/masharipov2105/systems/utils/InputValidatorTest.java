package com.masharipov2105.systems.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.masharipov2105.systems.exceptions.*;

public class InputValidatorTest{


    //==================================== ParseNumber ======================================
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



	//===================================== ParseCommand ============================================

	@Test
	void testParseCommandSuccess() throws NullPointerException, InvalidCommandException{

		assertEquals('+', InputValidator.parseCommand("+"));
		assertEquals('-', InputValidator.parseCommand("-"));
		assertEquals('*', InputValidator.parseCommand("*"));
		assertEquals('/', InputValidator.parseCommand("/"));
	}

	@Test
	void testparseCommandNullCommand() throws NullPointerException, InvalidCommandException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.parseCommand(null);});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testParseCommandEmptyCommand() throws NullPointerException, InvalidCommandException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.parseCommand("");});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testParseCommandInvalidCommand() throws NullPointerException, InvalidCommandException{

		Exception exp = assertThrows(InvalidCommandException.class, ()->{InputValidator.parseCommand("+-");});
		assertEquals("+- command not found !", exp.getMessage());

		Exception exp2 = assertThrows(InvalidCommandException.class, ()->{InputValidator.parseCommand("2");});
		assertEquals("2 command not found !", exp2.getMessage());
	}
}