package com.masharipov2105.systems;

import java.lang.ArithmeticException;

// Calculator sinfi 4ta instanse metod (+, -, *, /) amallari uchun
public class Calculator{

    // bo'sh konstruktor
	public Calculator(){}

    // qo'shish amali, 2 sonni yig'indiisni qaytaradi
	public int add(int a, int b){

		return (a + b);
	}

    // ayirish amali, 2 sonni ayirmasini qaytaradi
    public int sub(int a, int b){

    	return (a - b);
    }

    // ko'paytma amali 2 sonni ko'paytmasini qaytaradi
    public int inc(int a, int b){

    	return (a * b);
    }

    // bo'lish amali, 2 sonni bo'linmasini qaytaradi
    public double div(int a, int b) throws ArithmeticException{

    	if (b == 0){

    		throw new ArithmeticException("0 ga bo'lish mumkin emas");
    	}
    	return (a / b);
    }
}