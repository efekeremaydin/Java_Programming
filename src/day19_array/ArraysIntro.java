package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // int [] scores = new int[5];

//         scores = {85, 98, 97, 100, 88}; // i did these without watching Muhtar) good match

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;

        System.out.println("-------");

        int[] scores = new int[5]; // has to be same datatype. 5 is the length.
        // index: 0 ~ 4
        //scores = new int[5];
        // arr is ordered, easier to manage the data


        System.out.println(scores); // you will have hashcode: [I@4617c264. even if you have toString method used.


        System.out.println(Arrays.toString(scores)); // toString has method overloading. same method name but different parameters
        // you can use this method for 1D array

        scores[2] = 78; // access to index 2. then assign new data.
        scores[0] = 85;
        scores[1] = 75;
        scores[3] = 88;
        scores[4] = 95;

        // scores[6] = 100; // index out of bounds exception

        // scores[-1] = 65;// index out of bounds exception

        // scores = new int[10]; // with this above int array obj will be eligible for GC with all the elements within it.
        // index: 0 ~ 9

        //scores = new int[50]; // after this line both above array objects will be GC
        // index: 0 ~ 49

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("----");

        // print all elements in the array:
        for (int i = 0; i < scores.length; i++) { // i: index numbers of scores array
            System.out.println(scores[i]);
        }

        System.out.println("---");

        System.out.println(scores.length-1); // last index no of the arr

        System.out.println(scores[scores.length-1]);// last ind element of the arr






















    }
}
