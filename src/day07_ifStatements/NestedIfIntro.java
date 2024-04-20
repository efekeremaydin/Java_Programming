package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = -300;

        if (score >= 0 && score <= 100) { // if the score is valid (pre-condition) if this fails, nested if won't be checked.

            if (score >= 60) { // if the score is greater or equal to 60
                System.out.println("Passed");
            } else { // if the score is less then 60
                System.out.println("Failed");
            }

        } else { // if the score is invalid
            System.out.println("invalid score");
        }


        System.out.println("-------");

        int age = 320;

        if (age >= 1 && age < 150) {

            if (age >= 21) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        } else {
            System.out.println("invalid score");
        }

        System.out.println("--------------------");

        int day = -100;

        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tue");
            } else if (day == 3) {
                System.out.println("Wed");
            } else if (day == 4) {
                System.out.println("Thu");
            } else if (day == 5) {
                System.out.println("Fri");
            } else if (day == 6) {
                System.out.println("Sat");
            } else {
                System.out.println("Sun");
            }
        }
            else {
                System.out.println("invalid number");

        }
    }
}
