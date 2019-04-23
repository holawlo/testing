package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("2 + -3 = -1")
    void addPositiveAndNegativeNegResult() {
        assertEquals(-1, calculator.add(2, -3), "result should be negative");
    }

    @Test
    @DisplayName("2 + -1 = 1")
    void addPositiveAndNegativePosResult() {
        assertEquals(1, calculator.add(2, -1), "result should be positive");
    }

    @Test
    @DisplayName("-2 + 1 = -1")
    void addNegativeAndPositiveNegResult() {
        assertEquals(-1, calculator.add(-2, 1), "result should be positive");
    }

    @Test
    @DisplayName("5 - 2 = 3")
    void subtractTwoNumbers() {
        assertEquals(3, calculator.subtract(5, 2), "5 - 2 should be 3");
    }

    @Test
    @DisplayName("5 * 2 = 10")
    void multiplyTwoNumbers() {
        assertEquals(10, calculator.multiply(5, 2));
    }

    @Test
    @DisplayName("12 / 2 = 6")
    void divideTwoNumbers() {
        assertEquals(6, calculator.divide(12, 2));
    }

    @Test
    @DisplayName("2 ^ 10 = 1024")
    void powerTwoNumbers() {
        assertEquals(1024, calculator.power(2, 10));
    }

    @Test
    @DisplayName("2 ^ 0 = 1")
    void powerToZero() {
        assertEquals(1, calculator.power(2, 0));
    }

    @Test
    @DisplayName("12 / 0 = ? IllegalArgumentException")
    void divideByZero() {
        IllegalArgumentException thrownException =
                assertThrows(IllegalArgumentException.class, () -> calculator.divide(12, 0));

        Assertions.assertEquals("You can't divide by 0", thrownException.getMessage());
    }


}
