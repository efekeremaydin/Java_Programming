package day19_array;

import java.util.Arrays;

public class CharAlphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26];
        //char[0] = 'A';

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) i;
        }
        System.out.println(Arrays.toString(alphabet));
    }


}

/*
3. Create a char array and store all the alphabet letters in ascending order
 */