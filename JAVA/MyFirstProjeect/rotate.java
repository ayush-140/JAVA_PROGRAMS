import java.util.*;

public class rotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int temp[] = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) { // Corrected loop condition
            arr[i - d] = arr[i];
        }
        int j = 0;
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); // Changed to println for normal output
        }

    }
}
