public class LiteralPractice {

    public static void main(String[] args) {

        // Long literal (needs 'L' because the value is too large for int)
        long bigNumber = 9876543210L;

        // Float literal (needs 'f' to tell Java it's a float, not a double)
        float temperature = 36.6f;

        // Char literal using a Unicode escape sequence (© is \u00A9)
        char copyrightSymbol = '\u00A9';

        // Print values
        System.out.println("Long value: " + bigNumber);
        System.out.println("Float value: " + temperature);
        System.out.println("Char value: " + copyrightSymbol);
    }
}
