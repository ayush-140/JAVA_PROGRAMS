import java.util.*;

public class diagonal {
    public static void main(String[] args) {
        int row, col;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.err.println("enter the number of rows");
        row = input.nextInt();
        System.err.println("enter the number of coloumns");
        col = input.nextInt();
        int[][] matrix = new int[row][col];
        System.err.println("enter the elements for matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        // diagonal sum;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                if (i + j == row - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.err.println("sum of diagonals are " + sum);

    }
}
