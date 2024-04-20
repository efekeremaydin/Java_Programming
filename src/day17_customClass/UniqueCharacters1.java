package day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char ch = str.charAt(i);


            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch){
                    count++;
                }

            }
            if (count < 2 && !(result.equals(""+ch))){
                result+=ch;

            }
        }
        System.out.println(result);



    }
}

/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */

