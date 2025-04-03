package com.xworkz.inheretence.external;

import com.xworkz.inheretence.internal.Calculator;
import com.xworkz.inheretence.internal.ScientificCalculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new ScientificCalculator();
        Calculator basicCalculator = new Calculator();

        // Demonstrating basic calculator operations
        basicCalculator.add(4, 2);
        basicCalculator.subtract(10, 5);

        // Demonstrating scientific calculator operations
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.sin(30);
        scientificCalculator.cos(60);
        scientificCalculator.tan(45);
    }
}
