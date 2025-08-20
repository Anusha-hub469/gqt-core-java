package Encapsulation2;
class BankAccount {
    private int accountNumber;
    private double balance;
    void setData(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void getData() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
public class Exple17 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setData(12345, 1000.50);
        account.getData();
    }
}
