package day17_customClass;

public class FrequencyOfCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }

            }
            // this is to avoid duplication:
            if (result.contains(""+ch)) { // if result already contains the ch
                continue; // skip
            }
            result += ch + "" + count;


            //System.out.print(ch + "" + count);
          /*  result =ch + "" + count;
          //  System.out.print(result);
*/
        }
        System.out.print(result);

        }

       /* for (int k = 0; k < result.length(); k++) {
            if (result.contains(""+result.charAt(k))){
                continue;
            }
            result+=result.charAt(k);

        }
        System.out.print(result);
*/



    }
