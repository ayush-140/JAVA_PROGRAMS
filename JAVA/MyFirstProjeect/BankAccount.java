import java.util.*;

public class BankAccount {
    String name;
    int accountNo;
    String type;
    float balance;

    public void accountDetails(String name, int accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    public void initialBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public void withdraw(float withdrawAmount) {
        System.out.println("Your balance amount is " + balance);
        balance = balance - withdrawAmount;
    }

    public void showBalance() {
        System.out.println("This account is registered to " + name + " with balance amount " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountDetails("Ayush", 408600030);
        b.initialBalance(1000);
        b.deposit(13000);
        b.withdraw(1200);
        b.showBalance();
    }
}
