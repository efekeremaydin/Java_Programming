package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {


        char grade = 'Q';
        String result = "";

/*
        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else{
            result = "Failed";
        }
        System.out.println(result);



        System.out.println("---");

 */

        switch (grade) {
            case 'A':
                result = "Excellent";
                // System.out.println("Excellent");
                break;

            case 'B':
                result = "Great Job";
                //  System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                // result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                //System.out.println("Invalid");
                result = "Invalid"; // no need to add break if it's the last one

        }
          System.out.println(result);

        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

    }
}
