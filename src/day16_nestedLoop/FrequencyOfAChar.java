package day16_nestedLoop;

public class FrequencyOfAChar {

    public static void main(String[] args) {

        String str = "cccccccaabbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index number of str
            if (str.charAt(i) == ch){ // if the char of the string is equal to the given char, it means the given char has appeared in the string
                count ++;
            }
        }

        System.out.println(count);


    }
}

/*
2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

 */
