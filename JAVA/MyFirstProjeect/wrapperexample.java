public class wrapperexample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive types to their corresponding wrapper classes
        Integer num1 = 10; // Autoboxing int to Integer
        Double num2 = 3.14; // Autoboxing double to Double
        Character ch = 'a'; // Autoboxing char to Character
        Boolean bool = true; // Autoboxing boolean to Boolean

        System.out.println("Autoboxing:");
        System.out.println("Integer: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("Character: " + ch);
        System.out.println("Boolean: " + bool);

        // Unboxing: Converting wrapper classes back to their corresponding primitive
        // types
        int num3 = num1; // Unboxing Integer to int
        double num4 = num2; // Unboxing Double to double
        char ch2 = ch; // Unboxing Character to char
        boolean bool2 = bool; // Unboxing Boolean to boolean

        System.out.println("\nUnboxing:");
        System.out.println("int: " + num3);
        System.out.println("double: " + num4);
        System.out.println("char: " + ch2);
        System.out.println("boolean: " + bool2);

        // Returning the type
        System.out.println("\nReturning the type:");
        System.out.println("Type of num1: " + getType(num1));
        System.out.println("Type of num2: " + getType(num3));
        System.out.println("Type of ch: " + getType(ch));
        System.out.println("Type of bool: " + getType(bool));
    }

    // Method to return the type of the object
    public static String getType(Object obj) {
        return obj.getClass().getName();
    }
}
