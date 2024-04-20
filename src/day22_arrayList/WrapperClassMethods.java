package day22_arrayList;

import java.util.Arrays;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20"; // text

        System.out.println(str + 1); // 201

        // Integer num1 = Integer.parseInt(str); // autoboxing

        int num = Integer.parseInt(str); // prim to prim

        System.out.println(num + 1); // 21

        Integer num2 = Integer.valueOf(str); // wrapper to wrapper

        System.out.println(num2);

        System.out.println("---");

        String s = "20.5";
        double num3 = Double.parseDouble(s); // prim to prim // you assign to int to prevent extra processes like unboxing or autoboxing
        Double num4 = Double.valueOf(s); // wrapper to wrapper
        System.out.println(num3);
        System.out.println(num4);


        System.out.println("---");

        String x = "true"; // if it's anything other than true below methods will give false

        boolean r1 = Boolean.parseBoolean(x);

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("---");

        char ch = '$'; // how do you verify if this char is digit (without wrapper you need to use relational operators with ASCII table (char 0 and 9)

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special char
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("---");

        // extract digits and finding sum
        String string = "a1b2c3d4e5";

        int sum = 0;

        // 1: you can iterate, index by index, use ind number and call charAt method
        // 2: below

        // System.out.println(Arrays.toString(string.split("")));

        System.out.println(Arrays.toString(string.toCharArray()));
        char[] arr = string.toCharArray();

        for (char each : arr) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);

       /* for (char each : arr) {
            if (Character.isLetter(each)){
                continue;
            }
            sum += each;
        }
        System.out.println("sum = " + sum);*/

        // retrieving digits letters and special characters ( this can also be done using the above)



    }
}
