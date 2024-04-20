package day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) { // i: index numbers
            System.out.println(numbers[i]);
        }
        // you need to worry:
        // init: starting from 0
        // cond: iter until last element
        // iter: correct

        //DS: access first to last:
        // you can use for loop or for each:

        System.out.println("---");


        for (int each : numbers) { // iter is fixed depending on element's length
            System.out.println(each);
        }

        System.out.println("----");

        // disadv:
        // iter order and number of iter is fixed: from first to last
        // no ind numbers


       /* for (int i = 0; i < 100; i++) { // you can decide iter times with for loops

        }*/

        // DS 10 elements , for each will be run 10 times

        //adv of for each:
        // shorter and faster






    }
}
