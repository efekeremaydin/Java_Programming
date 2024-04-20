package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaabbccccddeeeeff";

        String result = ""; // bdf chars appears twice


        for (int j = 0; j < str.length(); j++) { // this is going to assign the chars one by one to the ch var in each loop

            char ch = str.charAt(j); // each char of str
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // this is going to compare all chars in the string with ch assigned above
                // responsible for comparing ch to each chars of the str and return the freq of the ch
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count == 2 && !result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
