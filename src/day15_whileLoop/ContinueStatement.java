package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {

            if (i == 4) { // 4 will be skipped in the loop2
                continue;
            }

            System.out.println(i);


        }


        System.out.println("----");

        for (int i = 10; i <= 20; i++) { // 10-20 iter
            if (i % 2 == 0) { // if i is even
                continue; // skip the current iter
            }
            System.out.println(i);
        }

        for (char i = 'A'; i <= 'G'; i++) { // i: A B C D E F G
            if (i == 'B' || i == 'E') { // if it's B or E
                continue; // skip
            }
            System.out.println(i);
        }

        System.out.println("---");

        for (int i = 0; i < 10; i++)
            System.out.println("Hello World"); // without curly braces you can only do with one statement
        System.out.println("Hello Cydeo"); // this is not in the for loop


        System.out.println("------");

        // find sum of all even numbers between 50-100

        int sum = 0;
        for (int i = 50; i <= 100; i++) {
            if (i %2 != 0 ){ // if the i is odd number
                continue; // skip
            }
            sum += i;
            
        }
        System.out.println(sum);

        for (int i = 50; i < 101; i+=2) {
            sum+=i;

        }

        for (int i = 50; i <101 ; i++) {
            if (i %2 ==0){
                sum+=i;
            }
        }







    }
}
