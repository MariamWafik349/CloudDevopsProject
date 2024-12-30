package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EnhancedMathService {

    public int add(int a, int b) {
        // Adding two numbers
        return a + b;
    }

    public int subtract(int a, int b) {
        // Subtracting the second number from the first
        return a - b;
    }

    public int multiply(int a, int b) {
        // Multiplying two numbers
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            // Handling division by zero
            throw new ArithmeticException("Division by zero is undefined");
        }
        // Returning a double result for more precision
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            // Modulus operation check for zero divisor
            throw new ArithmeticException("Cannot perform modulus by zero");
        }
        return a % b; // Return the remainder after division
    }
}
