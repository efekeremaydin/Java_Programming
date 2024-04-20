package day18_garbageCollection;

public class TestBankAccountObjects {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Efe", 123123, 10000000);

        System.out.println(account1);
        account1.deposit(100);
        System.out.println(account1);
        account1.withdraw(100);
        System.out.println(account1);



    }
}
