package com.masharipov2105.systems.service;

import com.masharipov2105.systems.models.CalculatorModel;
import com.masharipov2105.systems.exceptions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorServiceImplTest{

	@Test
	void testCalculateSuccess1() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0", '+');
		assertEquals(2.1, calc.calculate(model));
	}

	@Test
	void testCalculateSuccess2() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0", '-');
		assertEquals(0.1, calc.calculate(model));
	}

	@Test
	void testCalculateSuccess3() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0", '*');
		assertEquals(1.1, calc.calculate(model));
	}

	@Test
	void testCalculateSuccess4() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.1", '/');
		assertEquals(1.0, calc.calculate(model));
	}

	@Test
	void testCalculateInvalidNumber1() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1p", "1.0", '+');

		Exception exp = assertThrows(InvalidNumberException.class, ()->{calc.calculate(model);});
		assertEquals("Invalid number: 1.1p", exp.getMessage());
	}

	@Test
	void testCalculateInvalidNumber2() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0+", '+');

		Exception exp = assertThrows(InvalidNumberException.class, ()->{calc.calculate(model);});
		assertEquals("Invalid number: 1.0+", exp.getMessage());
	}

	@Test
	void testCalculateInvalidCommand() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0", '?');

		Exception exp = assertThrows(InvalidCommandException.class, ()->{calc.calculate(model);});
		assertEquals("? command not found !", exp.getMessage());
	}

	@Test
	void testCalculateEmptyCommand() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "1.0", ' ');

		Exception exp = assertThrows(NullPointerException.class, ()->{calc.calculate(model);});
		assertEquals("The command cannot be null or empty", exp.getMessage());
	}

	@Test
	void testCalculateDivisionByZero() throws CalculatorException{

		CalculatorServiceImpl calc = new CalculatorServiceImpl();
		CalculatorModel model = new CalculatorModel("1.1", "0.0", '/');

		Exception exp = assertThrows(DivisionByZeroException.class, ()->{calc.calculate(model);});
		assertEquals("Division by zero is not possible.", exp.getMessage());
	}
}