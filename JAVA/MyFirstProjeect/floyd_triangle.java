import java.util.*;

public class floyd_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("enter the number to be reached");
        int n = input.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(k++ + " ");
            }
            System.err.println();
        }
    }
}
