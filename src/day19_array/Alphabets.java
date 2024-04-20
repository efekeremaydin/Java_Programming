package day19_array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] ascending = new char[26]; // index 0~25
        char[] descending = new char[26];

        for (int i = 0, j = 'A'; i < ascending.length; i++, j++) {
            ascending[i] = (char)j;
            System.out.print(ascending[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(ascending));

        for (int i = 0, j='Z'; i < descending.length; i++, j--) {
            descending[i] = (char)j;
        }

        System.out.println(Arrays.toString(descending));
    }

}
