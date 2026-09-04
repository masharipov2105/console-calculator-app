package com.masharipov2105.systems;
import com.masharipov2105.systems.App;
import com.masharipov2105.systems.exceptions.CalculatorException;
import com.masharipov2105.systems.service.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) throws CalculatorException{
        
        App app = new App(new CalculatorServiceImpl());
        app.run();
    }
}
