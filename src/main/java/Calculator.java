public class Calculator {
    public static float add(float num1, float num2) {

        if (num1 >= 0 && num2 >= 0) {
            return num1 + num2;
        } else {
            throw new IllegalArgumentException("Numero non valido!");
        }
    }

    public static float subtract(float num1, float num2) {

        if (num1 >= 0 && num2 >= 0) {
            return num1 - num2;
        } else {
            throw new IllegalArgumentException("Numero non valido!");
        }
    }

    public static float divide(float num1, float num2) {

        if (num1 >= 0 && num2 >= 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Numero non valido!");
        }
    }

    public static float multiply(float num1, float num2) {

        if (num1 >= 0 && num2 >= 0) {
            return num1 * num2;
        } else {
            throw new IllegalArgumentException("Numero non valido!");
        }
    }
}
