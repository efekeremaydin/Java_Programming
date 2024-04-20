package day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzzyzyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){ // if the char is already contained in the new string
                continue; // skip it
            }
            result+=str.charAt(i);

        }
        System.out.println(result);


    }
}

/*
. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */
