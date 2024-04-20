package day16_nestedLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        sentence = sentence.toLowerCase();
        System.out.println(sentence);
        int count = 0;
        String str = sentence.substring(0, 4);

        while (true){
            if(sentence.contains(str)){
                count++;
            }
            break;
        }
        System.out.println(count);










    }
}

/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */

