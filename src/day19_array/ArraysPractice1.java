package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

//        String[] names = new String[5];
//        names[0] = "Feyyaz";
//        names[1] = "Anil";
//        names[2] = "Okan";
//        names[3] = "Serkan";
//        names[4] = "Oraz";

        String[] myGroup = new String[5]; // this will initiate the arr

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] = "Sumeye";
        // myGroup[100] = 100;  not possible cuz datatype is Stringdd
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";
     //    myGroup[5] = "Muhtar"; // size is fixed. index out of bounds exception
        System.out.println(Arrays.toString(myGroup)); // Array obj is mutable

        System.out.println("---");
        System.out.println(myGroup[1]);
        System.out.println("--");

        // print in the reverse order

        for (int i = myGroup.length-1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("---");

        // iterate from beginning shortcut: mygroup.fori

        /*for (int i = 0; i < myGroup.length; i++) {
            
        }*/

        // iterate from reverse order shortcut: mygroup.forr

        /*for (int i = myGroup.length - 1; i >= 0; i--) {

        }*/

        // Array that contains 1~100

        int[] oneToHundred = new int[100];

       /* for (int i = 0; i < oneToHundred.length; i++) {
            oneToHundred[i] = i+1;
            System.out.print(oneToHundred[i] + " ");
        }

        System.out.println();
        System.out.println("----");*/

        for (int i = oneToHundred.length - 1; i >= 0; i--) {
            oneToHundred[i] = i+1;
            //System.out.print(oneToHundred[i] + " ");
            
        }
        //System.out.println();

        System.out.println(Arrays.toString(oneToHundred));
























    }
}
