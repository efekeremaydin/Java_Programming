package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart", str2 = "earth";

        char[] str3 = str1.toCharArray();
        char[] str4 = str2.toCharArray();

        Arrays.sort(str3);
        Arrays.sort(str4);

        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));

        if (Arrays.equals(str3, str4)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*

	2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false

 */
