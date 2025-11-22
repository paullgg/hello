public class DefaultValues {

    // Member variables (fields) without initialization
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {

        // Create an object of the class
        DefaultValues obj = new DefaultValues();

        // Print the default values of each field
        System.out.println("Default byte: " + obj.byteValue);
        System.out.println("Default short: " + obj.shortValue);
        System.out.println("Default int: " + obj.intValue);
        System.out.println("Default long: " + obj.longValue);
        System.out.println("Default float: " + obj.floatValue);
        System.out.println("Default double: " + obj.doubleValue);
        System.out.println("Default char: '" + obj.charValue + "'");
        System.out.println("Default boolean: " + obj.booleanValue);
    }
}

