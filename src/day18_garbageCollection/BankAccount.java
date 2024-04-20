package day18_garbageCollection;

import java.util.HashMap;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        // this.notify(); // there are so many other methods you can use here even tho it's not defined. these are coming from Object class that contains all necessary functions all objs need.
    }

    public void checkBalance(){
        System.out.println(balance);
    }

    public void deposit (double amount){
        balance += amount;
    }

    public void withdraw (double amount2){
        balance -= amount2;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + (int)balance +
                '}';
    }
}

/*
2. Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount
 */