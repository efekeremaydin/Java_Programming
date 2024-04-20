package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        /*
        1. Readable, understandable, meaningful
        2. must be UNIQUE
        3. apply camelCase
        4. cannot have the space
        5. cannot start with digits
        6. cannot have special char other than _ and $
        7. cannot be Java reserved words
         */


        // age of the student is 28
        // salary 10000

        int age = 28;
        int salary = 10000;
        // int age = 32; variable name must be unique

        int phoneNumber = 1231232; //camelCase

        double salaryBeforeTax = 12313123.5;
        double salary_AfterTax$ = 123132.8;

        System.out.println("-------------");
        // 5. cannot start with digits
        int number = 10;
        int number1 = 20;
        int number3 = 30;

        // 7. cannot be Java reserved words

        // double abstract = 5.5;
        // double final = 3.3;

        System.out.println("------------------------------------");

        // gender is male
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);







    }
}
