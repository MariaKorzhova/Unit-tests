package HW1;

import HW1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Проверка метода calculateDiscount")
    void test1calc(){
        assertEquals(125, Calculator.calculateDiscount(250.00, 50));
    }

    @Test
    @DisplayName("Проверка на генерацию исключения в методе calculateDiscount")
    void test2calc(){
        assertThrows(ArithmeticException.class, () -> Calculator.calculateDiscount(250.00, -50));
    }
}
