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

        // ikki musbat son yig'indisi
		int a = 4;
		int b = 6;
		int result = 10;
		int actual = calculator.add(a, b);
		assertEquals(result, actual, "4 + 6 = 10");

		// manfiy va musbat sonlar yig'indisi
		assertEquals(3, calculator.add(-7, 10), "-7 + 10 = 3");

		// musbat va manfiy sonlar yig'indisi
		assertEquals(3, calculator.add(10, -7), "10 - 7 = 3");

		// ikiita manfiy son yig'indisi
		assertEquals(-17, calculator.add(-7, -10), "-7 - 10 = -17");
	}

	@Test
	void testSub(){

		// ikki musnbat son ayirmasi
		assertEquals(-8, calculator.sub(12, 20), "12 - 20 = -8");
		
		// musbat va manfiy son ayirmasi
		assertEquals(32, calculator.sub(12 ,-20), "12 - (-20) = 32");

		// manfiy va musbat son ayirmasi
		assertEquals(-32, calculator.sub(-12, 20), "-12 - 20 = -32");

		// ikki manfiy son ayirmasi
		assertEquals(8, calculator.sub(-12, -20), "-12 - (-20) = 8");
	}

	@Test
	void testInc(){

		// ikki musbat son ko'paytmasi
		assertEquals(20, calculator.inc(4, 5), "4 * 5 = 20");

		// musbat va amnfiy son ko'paytmasi
		assertEquals(-20, calculator.inc(4, -5), "4 * (-5) = -20");

		// manfiy va musbat son ko'paytmasi
		assertEquals(-20, calculator.inc(-4, 5), "-4 * 5 = 20");

		// ikki manfiy son ko'paytmasi
		assertEquals(20, calculator.inc(-4, -5), "-4 * (-5) = 20");
	}

	@Test
	void testDiv(){

		// ikki musbat son bo'linmasi
		assertEquals(5.0, calculator.div(20, 4), "20 / 4 = 5.0");
 
 		// musbat va manfiy son bo'linmasi
 		assertEquals(-5.0, calculator.div(20, -4), "20 / (-4) = -5.0");

 		// manfiy va musbat son bo'linmasi
 		assertEquals(-5.0, calculator.div(-20, 4), "-20 / 4 = -5.0");

 		// ikki manfiy son bo'linmasi
 		assertEquals(5.0, calculator.div(-20, -4), "-20 / (-4) = 5.0");

 		// 0 ga bo'lish amali
 		assertThrows(ArithmeticException.class, () -> calculator.div(20, 0), "0 ga bo'lish mumkin emas");
 	}
}