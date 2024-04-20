package day04_concatenation;

public class Circle {
    public static void main(String[] args) {

        int radius = 5;
        double area = radius * radius * 3.14;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + Math.round(perimeter)); // how do we get rid of the 000s after 31.4?



    }



}

/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   The area of the circle is 78.5
                   The perimeter of the circle is 31.4

 */
