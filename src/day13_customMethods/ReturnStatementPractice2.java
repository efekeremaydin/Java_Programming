package day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7){
            System.err.println("invalid");
            return; // to exit the main method.
        }

        System.out.println( (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wed" :(number == 4)? "Thu" :(number ==5)? "Fri" :(number ==6)? "Sat" : "Sun" ); // precondition is given implicitly. The only time this line gets executed is condition to the return line.if (number < 1 || number > 7){ this preconditon given implicitly.


    }


}
