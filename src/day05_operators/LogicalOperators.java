package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 60000;
        int creditScore = 650;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;

        System.out.println("eligibleForLoan = " + eligibleForLoan);

        System.out.println("---------------------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >=18 && country == "USA";
        //                          true                true
        System.out.println("eligibleToVote = " + eligibleToVote);;

        System.out.println("---------------------------");


        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println("validAnswer = " + validAnswer);

        System.out.println("---------------------------");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C';

        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println("---------------------------");

        System.out.println(!true);

        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


        System.out.println("---------------------------");

        System.out.println( true == !false && false == !true && true != !true );
//                              true                true            true        = true






















    }
}
