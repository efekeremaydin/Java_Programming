package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {
        String str = "efekeremaydin";
        //            0123
        // "avaJ"

        String reverse = ""; // so that i can store the chars

        for (int i = str.length() - 1; i >= 0; i--) { // i is the index number here. last index (length-1) to index 0.
            // System.out.print(str.charAt(i)); // using i we can print the char
            reverse += str.charAt(i); // i to get each char. how can i store each char into this string > you will += concat, add to the reverse string
        }
        System.out.println(reverse);

        System.out.println("------");

        System.out.println(reverse("efem"));

        String name = "asd asd asd ada s asd asd";
        String result = reverse(name);
        System.out.println(result);

    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
