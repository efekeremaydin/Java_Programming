package day14_forLoop;

import java.util.Scanner;

public class WarmupTasks {

    public static void main(String[] args) {

        String result = combineTwoStrings("one", "eight");
        System.out.println(result);

        String result3 = combine("one", "eight");
        System.out.println(result3);

        String test = combine2("one", "eight");
        System.out.println(test);

        System.out.println("'---");

        System.out.println(sumOf2IntegerNumbers(1, 2));
        System.out.println(sumOf3IntegerNumbers(1, 2, 3));
        System.out.println(sumOf4IntegerNumbers(1, 2, 3, 4));

    }

    public static String combineTwoStrings (String str1, String str2){

        String combine = "";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first String");
//        str1 = input.next();
//
//        System.out.println("enter second String");
//        str2 = input.next();

        char str1LastLetter = str1.charAt(str1.length()-1);
        char str2FirstLetter = str2.charAt(0);

        if (str1LastLetter == str2FirstLetter){
            combine = str1 + str2.substring(1);
        } else {
            combine = str1 + str2;
        }
        return combine;

    }

    public static String combine (String str3, String str4){

        String result2;

        if (str3.endsWith(""+str4.charAt(0))){ // if the first string ends with the first char of the second string/ empty string is the way to make the char a string
            result2 = str3 + str4.substring(1);
        } else {
            result2 = str3 + str4;
        }
        return result2;
    }

    public static String combine2 (String str5, String str6){

        String result;

        if (str5.charAt(str5.length()-1) == str6.charAt(0)){ // if the last char of the first string equals last char of the second String
            result = (str5 + str6.substring(1)); // first char of the second string should be excluded in the concat
        } else {
            result = (str5 + str6);
        }
        return result;
    }

    public static int sumOf2IntegerNumbers (int n1, int n2){
        return n1 +n2;
    }

    public static int sumOf3IntegerNumbers (int n1, int n2, int n3){
        //return n1 +n2+n3;
        return sumOf2IntegerNumbers(n1, n2) + n3;
    }

    public static int sumOf4IntegerNumbers (int n1, int n2, int n3, int n4){
        //return n1+n2+n3+n4;
        //return sumOf3IntegerNumbers(n1, n2, n3) + n4;
        //return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
        // return sumOf2IntegerNumbers(sumOf3IntegerNumbers(n1, n2, n3), n4);
        return sumOf3IntegerNumbers(sumOf2IntegerNumbers(n1, n2), n3, n4);
    }

}


/*
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight




Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers


 */
