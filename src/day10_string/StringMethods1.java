package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo"; // 5 char 4 index
        // index:     01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);
        // char sixthChar = str.charAt(5); // index out of bounds

        // char nthChar = str.charAt(-25); // out of bounds
        // char nthChar1 = str.charAt(25); // out of bounds

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("----");

        String sentence = "Java Programming Language";
        // index:          0123 4567891011...

        int length = sentence.length();
        System.out.println("length = " + length);
        
        int lastIndex = length -1;
        System.out.println("lastIndex = " + lastIndex);


        System.out.println("---");

        String s1 = "Java is the best programming language"; // why don't we use new keyword in these examples?

        char f = s1.charAt(0);
        int lastIndexNum = s1.length()-1;
        char l = s1.charAt(lastIndexNum);
        int length1 = s1.length();
        char l2 = s1.charAt(length1-1);



        System.out.println("f = " + f);
        System.out.println(f + " : " + l);
        System.out.println("lastIndexNum = " + lastIndexNum);
        System.out.println("l = " + l);
        System.out.println("l2 = " + l2);

        System.out.println("---");

        String name1 = "Umran"; // literals are same object are diff.
        String name2 = new String("Umran"); // this obj is outside of the pool

        System.out.println(name1 == name2); // false
        System.out.println(name2.equals(name1)); // this checks the values

        System.out.println(name1.equals(name2));

        System.out.println("---");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3); // false
        System.out.println(r1.equals(r3)); // true
        System.out.println(r2.equals(r3)); // true

        // when you use scanner it creates String obj by default. so if you use == operator you will get false even if they are the same texts.

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? Yes/No");
        String citizen = input.next();

        if (age >= 21 && citizen.equals("Yes")){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        input.close();

        String str1 = "cydeo";
        System.out.println(str1.indexOf("o"));


    }
}
