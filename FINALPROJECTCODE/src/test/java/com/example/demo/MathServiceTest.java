package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EnhancedMathServiceTest {

    @Autowired
    private EnhancedMathService enhancedMathService;

    @Test
    void testAddition() {
        int result = enhancedMathService.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        int result = enhancedMathService.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    void testMultiplication() {
        int result = enhancedMathService.multiply(4, 6);
        assertEquals(24, result, "4 * 6 should equal 24");
    }

    @Test
    void testDivision() {
        double result = enhancedMathService.divide(8, 4);
        assertEquals(2.0, result, "8 / 4 should equal 2.0");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> enhancedMathService.divide(10, 0),
                "Dividing by zero should throw ArithmeticException");
    }

    @Test
    void testModulus() {
        int result = enhancedMathService.modulus(10, 3);
        assertEquals(1, result, "10 % 3 should equal 1");
    }

    @Test
    void testModulusByZero() {
        assertThrows(ArithmeticException.class, () -> enhancedMathService.modulus(10, 0),
                "Modulus by zero should throw ArithmeticException");
    }
}
