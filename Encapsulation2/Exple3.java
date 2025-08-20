package Encapsulation2;
class Bank {
    private String accountNumber;
    private double balance;
    void setData(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    void getData() {
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Balance = " + balance);
    }
}
public class Exple3 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setData("12345", 1000);
        b.deposit(500);
        b.withdraw(200);
        b.getData();
    }
}

