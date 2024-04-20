package day16_nestedLoop;

public class NestedLoopPractice2 {

    public static void main(String[] args) {


        String str = "aacvvbb";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(ch);
            }

        }
    }
}

