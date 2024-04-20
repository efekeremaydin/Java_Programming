package day16_nestedLoop;

public class Frequency {

    public static void main(String[] args) {

        String str = "aaabbbbccccc";
        char c = 'c';
        char a = 'a';
        char b = 'b';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c){
                frequency+=1;
            }

        }
        System.out.println("frequency of " + c + " is " + frequency);



    }
}

/*
 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */
