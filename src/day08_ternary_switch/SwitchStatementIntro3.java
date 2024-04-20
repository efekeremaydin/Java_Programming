package day08_ternary_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        /*
        int score = 85;
        String result = "Your grade is ";

        if (score >= 90){ // false: score < 90
            result += "A";
        } else if (score >=80 && score <90 ) { // false: score < 80, so you dont need this && score <90
            result += "B";
        } else if(score >=70 && score <80){// false: score < 70, so you dont need this && score <80
            result += "C";
        }else if (score >= 60 && score <70){// false: score < 60
            result += "D";
        }else{ // score < 60
            result += "F";
        }

        System.out.println(result);

         */

        int score = 0;
        String result = "";

        switch (score){
            case 1:
                result += "F";
                break;
            case 2:
                result += "F";
                break;
            case 3:
                result += "F";
                break;
            default:
                result += "Invalid";
        }
        System.out.println(result);

    }
}
