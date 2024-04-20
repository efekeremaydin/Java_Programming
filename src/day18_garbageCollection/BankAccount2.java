package day18_garbageCollection;

import java.util.HashMap;

public class BankAccount2 {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    } // instance as they need to be run separately

    public String toString() {
        return "BankAccount2{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    } // instance bec they need to run separately

    public void checkBalance() {
        System.out.println("Your available balance is: $" + balance);
    }

    public void deposit(double amount) {
        if (amount < 1) { // if amount is invalid
            System.out.println("Insufficient deposit amount " + amount);
            return; // exit the method
        }
        System.out.println("Depositing $" + amount + " to " + accountHolder);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println("Insufficient withdraw amount: " + amount);
            return;
        }
        System.out.println("Withdrawing $" + amount + " from " + accountHolder);
        balance -= amount;
    }


}
