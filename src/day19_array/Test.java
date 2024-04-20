package day19_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        System.out.println(boolToWord(true));
        //System.out.println(numberToString(4));
        Test test1 = new Test();
        System.out.println(test1.numberToString(4));

        System.out.println(stringToNumber("123"));

        int[] a = {1,2,3};
        System.out.println(divisibleBy(a, 5));

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(3);
        System.out.println(checkIt(b, 3));

    }

    public static String boolToWord (boolean b){

        //String result2 = String.valueOf(b);
        //String result3 = Boolean.toString(b);


        return b? "true" : "false" ;
    }

    public String numberToString (int number){

        return String.valueOf(number);
    }

    public static int stringToNumber (String str){

        return Integer.parseInt(str);
    }

    public static ArrayList<Integer> divisibleBy (int[] arr, int number){

        ArrayList<Integer> result = new ArrayList<>();
        for (int each : arr) {
            if(each %number == 0){
                result.add(each);
            }
        }

        return result;
    }

    public static ArrayList<Integer> checkIt(ArrayList<Integer> testSequence, int divisor) {
        ArrayList<Integer> resultAL = new ArrayList<>();
        testSequence.removeIf(p -> p % divisor != 0);
        return testSequence;
    }

}


