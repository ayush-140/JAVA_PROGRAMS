public class StringFunctions {
    public static void main(String[] args) {

        String str = "   Hello, World!   ";
        int length = str.length();
        System.out.println("Length of the string: " + length);
        String concatStr = str.concat(" Welcome");
        System.out.println("Concatenated string: " + concatStr);
        String replacedStr = str.replace('o', '0');
        System.out.println("String after replacing 'o' with '0': " + replacedStr);

        String replacedAllStr = str.replaceAll("Hello", "Hi");
        System.out.println("String after replacing 'Hello' with 'Hi': " + replacedAllStr);

        String trimmedStr = str.trim();
        System.out.println("String after trimming: " + trimmedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("String starts with 'Hello': " + startsWithHello);

        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("String ends with 'World!': " + endsWithWorld);

        // Retrieve a substring
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);

        String[] parts = str.split(",");
        System.out.println("Splitting the string by comma:");
        for (String part : parts) {
            System.out.println(part.trim());
        }

        boolean containsHello = str.contains("Hello");
        System.out.println("String contains 'Hello': " + containsHello);
    }
}
