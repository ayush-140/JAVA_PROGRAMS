import java.util.*;

public class sortstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String S = input.nextLine();
        char chararray[] = S.toCharArray();
        Arrays.sort(chararray);
        String sorted = new String(chararray);
        System.out.println("after sorting the alphabets the string is " + sorted);
    }
}
