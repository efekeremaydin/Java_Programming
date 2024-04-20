package day15_whileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "eeffrr";

        String result = ""; // efr

        for (int i = 0; i < str.length(); i++) { // this i represents the index number of str

           /* if (str.contains(str.charAt(i))){
                result +=
            }*/
            char each = str.charAt(i); // each char of the str

            if (!(result.contains(""+each))) { // if the string result does not contain the char of string str yet
                result += each; // then we will add the char to string result
            }

        }
        System.out.println(result);
        // if the char is not contained yet in the new string then we will add it to the new string


    }
}

/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc

 */
