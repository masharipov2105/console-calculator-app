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

	//============================== IsYes =========================================

	@Test
	void testIsYesSuccess() throws NullPointerException{

		assertEquals(true, InputValidator.isYes("yes"));
		assertEquals(true, InputValidator.isYes("y"));
	}

	@Test
	void testIsYesNullCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isYes(null);});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsYesEmptyCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isYes("");});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsYesNotYesCommand() throws NullPointerException{

		assertEquals(false, InputValidator.isYes("iueroiwer703"));
	}




	//============================== IsNo =========================================

	@Test
	void testIsNoSuccess() throws NullPointerException{

		assertEquals(true, InputValidator.isNo("no"));
		assertEquals(true, InputValidator.isNo("n"));
	}

	@Test
	void testIsNoNullCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isNo(null);});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsNoEmptyCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isNo("");});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsNoNotNoCommand() throws NullPointerException{

		assertEquals(false, InputValidator.isNo("iueroiwer703"));
	}



	//============================== IsExit =========================================

	@Test
	void testIsExitSuccess() throws NullPointerException{

		assertEquals(true, InputValidator.isExit("exit"));
		assertEquals(true, InputValidator.isExit("quit"));
	}

	@Test
	void testIsExitNullCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isExit(null);});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsExitEmptyCommand() throws NullPointerException{

		Exception exp = assertThrows(NullPointerException.class, ()->{InputValidator.isExit("");});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testIsExitNotExitCommand() throws NullPointerException{

		assertEquals(false, InputValidator.isExit("iueroiwer703"));
	}
}