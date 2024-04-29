import Calculator.addition.Add;
import Calculator.substraction.Subtract;
import Calculator.multiplication.Multiply;
import Calculator.division.Divide;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nSelect operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = Add.add(num1, num2);
                break;
            case 2:
                result = Subtract.subtract(num1, num2);
                break;
            case 3:
                result = Multiply.multiply(num1, num2);
                break;
            case 4:
                result = Divide.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
