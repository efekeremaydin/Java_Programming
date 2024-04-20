package day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase(); // cydeo school. this is new strting so needs to be reassigned.

        System.out.println(str1);

        System.out.println("---");

        String str2 = "java programming";

        String str3 = str2.toUpperCase(); // it creates a new object.

        System.out.println(str2);
        System.out.println(str3);

        System.out.println("----");

        String word = "Wooden Spoon";
        word = word.toUpperCase(); // "WOODEN SPOON"

        word = word.toLowerCase(); // wooden spoon

        System.out.println(word);

        System.out.println("---");

        String str4 = "           Cydeo School";
        System.out.println(str4);

        str4 = str4.trim();
        System.out.println(str4);

        System.out.println("---");

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');
        System.out.println(index1);

        String s1 = "I love Java Programming";

        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a "); // this will return the index of second a
        System.out.println(secondA);

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');

        System.out.println(a1);
        int a2 = s2.indexOf("a Python");
        //int a2 = s2.indexOf("va")+1;
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);

        System.out.println("-----");

        String w = "Java";
        System.out.println(w.indexOf('a')); // 1

        System.out.println(w.lastIndexOf('a'));

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));













    }
}
