package day10_string;

//import java.lang.String; // import for String. implicitly imported.
//import java.lang.System; // implicitly imported.
import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        input.close();

        System.out.println("-------");

        String s1 = "Cat";
        String s2 = "Dog";

        // 2 String literal object. 2 objects were created.

        String s3 = "Cat";
        String s4 = "Cat";
        // 2 other String literal. NO other object were created.

        System.out.println(s1 == s4); // same objects
        System.out.println(s1 == s3); // same objects
        System.out.println(s3 == s4); // same objects => == operator return true if the two objects are same one objects.


        System.out.println("---");

        String str1 = new String("Java"); // Creates two objects. 1. String pool. 2. in heap (outside string pool) // WHY TWO OBJECTS? ISN'T IT ONLY ONE?
        String str2 = new String("Java");

        System.out.println(str1 == str2); // it will compare if two objects are the same objects and return true or false. as they are two diff objects, this will return false.
        System.out.println(str1.equals(str2));


        System.out.println("--");

        String t1 = "Python"; // String pool. we only have 1.
        String t2 = new String("Python"); // outside the String pool. we only have 1.
        String t3 = new String("Python"); // outside the String pool. we have 2 now.

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2); // false. they are not the same objects.
        System.out.println(t3 == t2); // false. they are two different obj outside of the heap








    }
}
