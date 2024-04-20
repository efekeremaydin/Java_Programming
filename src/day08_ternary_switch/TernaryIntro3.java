package day08_ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 130;

        /*
        String result = "";

        if (score >= 0 && score <100){

            if (score >= 60){
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "Invalid";
        }



        System.out.println(result);


         */


        String result = (score >= 0 && score < 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";
        System.out.println(result);

        System.out.println("---");

        int n = 8;

        String day = (n >= 1 && n <= 7) ?
                (n == 1)? "Mon" :(n == 2)? "Tue" :(n == 3)? "Wed":(n == 4)? "Thu":(n == 5)? "Fri":(n == 6)? "Sat": "Sun"
                : "No such day";
        System.out.println(day); // number of question marks and column must be equal
        }
    }

