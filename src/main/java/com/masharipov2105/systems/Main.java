package com.masharipov2105.systems;

import com.masharipov2105.systems.exceptions.CalculatorException;
import com.masharipov2105.systems.service.*;
import com.masharipov2105.systems.controller.CalculatorController;

public class Main {
    public static void main(String[] args) throws CalculatorException, NullPointerException{
        
        CalculatorService service = new CalculatorServiceImpl();
        CalculatorController controller = new CalculatorController(service);
        controller.start();
    }
}
