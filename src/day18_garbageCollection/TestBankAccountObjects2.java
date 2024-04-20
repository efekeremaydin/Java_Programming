package day18_garbageCollection;

public class TestBankAccountObjects2 {

    public static void main(String[] args) {

        BankAccount2 obj1 = new BankAccount2();
        obj1.setInfo("Gadir", 1231231232);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(400);
        obj1.checkBalance();

        System.out.println("---");

        BankAccount2 account1 = new BankAccount2();

        BankAccount2 account2 = new BankAccount2();

        account1.setInfo("Sebastian", 123123);

        account2.setInfo("Umran", 123123);

        account1.deposit(5000);
        account2.deposit(10000);
        account1.checkBalance();
        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(1000);
        System.out.println(account1);
        System.out.println(account2);








    }


}
