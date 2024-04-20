package day07_ifStatements;

public class MonthName {

    public static void main(String[] args) {

        int num = 10;

        String month = "";

        if (num >= 1 && num <= 12) // this is an example of if without curly braces.

            /*
            if (num ==1){
                System.out.println("Jan");
            }
            if (num ==2){
                System.out.println("Feb");
            }
            if (num ==3){
                System.out.println("Mar");
            }
            if (num ==4){
                System.out.println("Apr");
            }
            if (num ==5){
                System.out.println("May");
            }
            if (num ==6){
                System.out.println("Jun");
            }
            if (num ==7){
                System.out.println("Jul");
            }
            if (num ==8){
                System.out.println("Aug");
            }
            if (num ==9){
                System.out.println("Sep");
            }
            if (num ==10){
                System.out.println("Oct");
            }
            if (num ==11){
                System.out.println("Nov");
            }else {
                System.out.println("Dec");
            }

             */
            if (num == 1) month = "Jan";
            else if (num == 2) month = "Feb";
            else if (num == 3) month = "Mar";
            else if (num == 4) month = "Apr";
            else if (num == 5) month = "May";
            else if (num == 6) month = "Jun";
            else if (num == 7) month = "Jul";
            else if (num == 8) month = "Aug";
            else if (num == 9) month = "Sep";
            else if (num == 10) month = "Oct";
            else if (num == 11) month = "Nov";
            else month = "Dec";

         else
            month = "No such a month";

        System.out.println(month);


    }
}

