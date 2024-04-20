package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = ""; // to contain all the char of the given string in reversed order
        for (int i = str.length() - 1; i >= 0; i--) { // in order to get the index numbers of the string
            // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each chars of the string starting from last index to index 0.
        }
        return reverse;
    }

    // Frequency of a word in a sentence

    public static int frequencyOfAWord (String sentence, String word){
        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, "");
        }
        return count;

    }

    // Frequency of a letter in a word

    // Remove duplicates from a word

}
