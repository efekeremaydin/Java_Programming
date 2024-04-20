package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("----");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" "); // splits by space
        System.out.println(Arrays.toString(words));

        System.out.println("----");

        String sentence = "I love Java";
        // reverse above: "Java love I"

//        String[] sentence2 = sentence.split(" ");
//        System.out.println(Arrays.toString(sentence2));
//
//        System.out.println(Arrays.toString(ArraysUtility.reverse(sentence2)));

        String[] arr = ArraysUtility.reverse(sentence.split(" "));
        System.out.println(Arrays.toString(arr));

        String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence.trim());




    }
}
