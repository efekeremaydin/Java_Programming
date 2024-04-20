package day14_forLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("----");

        for (int num=1; num<10; num++){ // after statement then iter then cond ..
            // num 1, true, HW 1 time, num 2, true, HW 2 times, num 3, true, HW 3rd time, num 4, true, HW 4th time, .... num 11 false. terminated
            // num: 1,2,3,4,5,6,7,8,9,10
            // just looking at the loop you can tell how many times it's going to be exec.
            // num gives you lots of outputs for lots of tasks
            System.out.println(num + "-Hello World"); // 1,2,3,4,5,6,7,8,9,10
        }
//        for (int num=1; num<=10;){ // this is inf loop as num will always 1 and it never increases
//            System.out.println(num + "-Hello World");
//        }







    }
}
