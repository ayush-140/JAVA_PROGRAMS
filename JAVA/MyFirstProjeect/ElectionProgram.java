import java.util.Scanner;

public class ElectionProgram {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String name[] = new String[5];
        int votes[] = new int[5];
        int totalvotes = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("enter the name of the candidate " + (i + 1) + ":");
            name[i] = input.nextLine();
            System.out.print("enter the number of the votes received by  " + name[i] + ":");
            votes[i] = input.nextInt();
            input.nextLine();
            totalvotes += votes[i];
        }
        int index = 0;
        double maxpercentage = 0;
        for (int i = 0; i < 5; i++) {
            double percentage = (double) votes[i] / totalvotes * 100;
            if (percentage > maxpercentage) {
                maxpercentage = percentage;
                index = i;
            }
        }
        System.out.println("The winner of the election is " + name[index] + "with percentage " + maxpercentage);

    }
}