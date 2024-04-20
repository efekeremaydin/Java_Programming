package day16_nestedLoop;

public class FrequencyOfWord3 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, ""); //Java Java Java
        }

        System.out.println(count);











    }
}
