package day16_nestedLoop;

public class FrequencyWithWhile {

    public static void main(String[] args) {


        String str = "adasdasdasaa";
        char ch = 'a';

        int count = 0;

        int i =0;
        while (i<str.length()){
            if (str.charAt(i) == ch){
                count++;
            }
            i++;
        }

        System.out.println(count);
    }
}
