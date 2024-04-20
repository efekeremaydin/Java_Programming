package day21_multiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces2 {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        String result = "";
        str = str.trim();

        System.out.println(str);

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        str = "";

/*        for (String each : words) {
            if (!(each.equals(" "))){
                str += each;
            }
        }*/

        for (String each : words) {
            if (!each.isEmpty()){
                str += each + " ";
            }
        }
        str = str.trim(); // to remove thel last spaces
        System.out.println(str);


    }


}
