package day14_forLoop;

public class ForLoopsPractice {

    public static void main(String[] args) {

        // resp of iter: making cond false eventually, if iter makes cond not false there's no point.

        /*for (int i = 5; i<=10; i--){ // if you do that it will be inf loop as iter wont make the cond false.
            System.out.println("Hello Cydeo"); // inf times
        }*/// WHY THIS WAS NOT PROVIDE the BELOW statement as unreachable?

//        for (;;){ // inf loop
//            // this does state the below as unreachable
//            System.out.println("hello");
//        }


//        System.out.println("Hello World"); // this wont be printed

        int count = 0;
        for (int i = 10; i > 5; i--) { // i: 10, 9, 8, 7, 6, 5
            System.out.println((count += 1) + "-Hello"); // 1, 2, 3, 4, 5, 6

        }


        /*for (int i = 5; i<=10; i--){ // you need to check the iter. and cond for the loop to become not inf.
            // 1. cond created based on init value?
            // 2. iter. is this capable enough to make the cond false?
            System.out.println("Hello Cydeo"); // inf times
        }*/


        System.out.println("----");

        /*int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= 100; i++) {
            sum1 = i += 1;
            sum2 = sum1 + 1;
        }
        System.out.println(sum2);*/

        // sum of all numbers 1-100

        int sum =0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // print all alphabet letters A-Z
        for (char i ='A'; i<='Z'; i++){
            System.out.print(i);
        }

        System.out.println();
        System.out.println("-------");

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i);
        }

        System.out.println();





    }
}
