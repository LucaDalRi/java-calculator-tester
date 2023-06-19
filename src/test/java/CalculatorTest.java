import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertEquals(300, Calculator.add(100, 200));
    }

    @Test
    @DisplayName("Sottrazione fallita")
    void testSubtractFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(2, -1), "Deve dare errore");
    }

    @Test
    @DisplayName("Sottrazione riuscita")
    void testSubtract() {
        assertEquals(100, Calculator.subtract(200, 100));
    }

    @Test
    @DisplayName("Divisione fallita")
    void testDivideFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-2, -3), "Deve dare errore");
    }

    @Test
    @DisplayName("Divisione riuscita")
    void testDivide() {
        assertEquals(20, Calculator.divide(100, 5));
    }

    @Test
    @DisplayName("Moltiplicazione fallita")
    void testMultiplyFail() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(2, -1), "Deve dare errore");
    }

    @Test
    @DisplayName("Moltiplicazione riuscita")
    void testMultiply() {
        assertEquals(50, Calculator.multiply(5, 10));
    }

}