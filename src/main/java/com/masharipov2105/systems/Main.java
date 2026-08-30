package com.masharipov2105.systems;

import java.lang.ArithmeticException;

public class Main {
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();

        System.out.println(cal.add(2, 3)); // 5
        System.out.println(cal.sub(5, 7)); // -2
        System.out.println(cal.inc(10, 10)); // 100

        try{

            System.out.println(cal.div(3, 2));
        } catch(ArithmeticException e){

            System.out.println(e.getMessage());
        }
    }
}
