package day16_nestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "java JAVA jAvA JAva";
        int count = 0;
        String str = sentence.substring(0, 4);
        //System.out.println(str);

        if (sentence.contains(str)){
            count++;
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
