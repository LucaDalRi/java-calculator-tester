import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    @DisplayName("Addizione fallita")
    void testAddFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.add(-2, -3), "Deve dare errore");
    }

    @Test
    @DisplayName("Addizione riuscita")
    void testAdd() {
        System.out.println(Calculator.add(100, 200));
    }

    @Test
    @DisplayName("Sottrazione fallita")
    void testSubtractFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(2, -1), "Deve dare errore");
    }

    @Test
    @DisplayName("Sottrazione riuscita")
    void testSubtract() {
        System.out.println(Calculator.subtract(200, 100));
    }

    @Test
    @DisplayName("Divisione fallita")
    void testDivideFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-2, -3), "Deve dare errore");
    }

    @Test
    @DisplayName("Divisione riuscita")
    void testDivide() {
        System.out.println(Calculator.divide(100, 3));
    }

    @Test
    @DisplayName("Moltiplicazione fallita")
    void testMultiplyFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(2, -1), "Deve dare errore");
    }

    @Test
    @DisplayName("Moltiplicazione riuscita")
    void testMultiply() {
        System.out.println(Calculator.multiply(20, 100));
    }

}