public class exception {

    public static void main(String args[]) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("hello world");
    }

}
