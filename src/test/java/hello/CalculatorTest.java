package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testValidExpression() {
        Calculator calculator = new Calculator();
        double value = calculator.calculate("1 + 1"); // Правильний вираз
        assertEquals(2.0, value);
    }

    // Закоментований тест, який завжди не проходить
    // @Test
    // public void testFailingExpression() {
    //     Calculator calculator = new Calculator();
    //     double value = calculator.calculate("5 - 1"); // Неправильний результат
    //     assertEquals(2.0, value); // Це має провалитися
    // }

    @Test
    public void testInvalidExpression() {
        Calculator calculator = new Calculator();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate("invalid expression"); // Неправильний формат
        });
        assertEquals("Неправильний формат виразу. Використовуйте: число оператор число", thrown.getMessage());
    }
}
