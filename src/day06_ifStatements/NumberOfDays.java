package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 3;

        String result = "";

        if (number == 1 || number ==3 || number ==5 || number ==7 || number ==8 || number ==10 || number ==12){
            result = "31 days";
        }
        if (number == 4 || number ==6 || number ==9 || number ==11 ){
            result = "30 days";
        }
        if (number == 2 ){
            result = "28 days";
        }

        System.out.println(result);

        System.out.println("---------");

        boolean has28Days = number == 2; // if the month number is 2 (Feb) then it has 28 days
        boolean has30Days = number == 4 || number ==6 || number ==9 || number ==11; //
        boolean has31Days = !has30Days && !has28Days;
        // if the month doesnt have 28 and 30 days then it has 31 days

        if (has28Days){
            result = "28 Days";
        }
        if (has30Days){
            result = "30 Days";
        }
        if (has31Days){
            result = "31 Days";
        }

        System.out.println(result);

        /*
        int a = 8;
        a*=3.2;
        System.out.println(a);
      //  a = (int)(a*3.2);
        System.out.println(a);

         */




    }
}
