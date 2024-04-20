package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "aabccd";

        String unique = "";
        String result = "";

        for (int j = 0; j < str.length(); j++) { // resp of this loop: to repeat the below statements

// we need to repeat below step for every single char
            char ch = str.charAt(j); // if first char is unique
            // a
            // you need to change the index number each time you want to change the char
            int frequency = 0; // this is here cuz freq needs to be reset each time

            // how to get every single char of string
            for (int i = 0; i < str.length(); i++) { // resp for comparing ch with every single chars
                if (str.charAt(i) == ch) { // whenever this is true that means ch appeared in the string
                    //checks how many times the ch appeared in the str
                    // if the ch appeared in the string, then,
                    frequency++; // increase frequency
                }
            }

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)){
                    result+=ch;
                }
            }
            System.out.println(result);

        }


        }
}

