import java.util.*;

public class calculator {
    public static void main(String[] args) {
        int choice;
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first element:");
        x = input.nextInt();
        System.out.println("Enter second element:");
        y = input.nextInt();
        System.out.println(
                "Enter your choice (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division):");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                int sum = x + y;
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int sub = x - y;
                System.out.println("Difference: " + sub);
                break;
            case 3:
                int mul = x * y;
                System.out.println("Product: " + mul);
                break;
            case 4:
                if (y != 0) {
                    int div = x / y;
                    System.out.println("Quotient: " + div);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
