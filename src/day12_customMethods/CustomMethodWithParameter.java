package day12_customMethods;

public class CustomMethodWithParameter {

    public static void main(String[] args) {

        oddOrEvenNumber(1);
        oddOrEvenNumber(12);
        eligibleToBuyAlcohol(23);
        oddOrEvenNumber(4);
        oddEvenOrZero(0);

        gradeLevelMethod(11);
        gradeLevelMethod2("A");

        initials("Efe", "Aydin");

        maxNumber(10.5,20.5);

        initial2("Neziha", "Aydin");

        initial2("Efe", "Aydin");



    }

    // the method takes and argument number abd verifies if the number is odd or even
    public static void oddOrEvenNumber(int number) {

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

    // create a method that can check if a person is eligible to buy alcohol

    public static void eligibleToBuyAlcohol(int age) {
        if (age > 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    // create a method that can check if a number is odd, or even, or zero

    public static void oddEvenOrZero(int number2) {

        if (number2 == 0) {
            System.out.println("zero");
        } else if (number2 % 2 == 0) {
            System.out.println("even");
        } else if (!(number2 == 0)) {
            System.out.println("odd");
        }

    }

    // create a method that can calculate the grade of students
    public static void gradeLevelMethod(int gradeLevel2) {
        gradeLevel2 = 7;
        String result = "";

        if (gradeLevel2 <= 5) { // false: gradeLevel >5
            result = "Elementary";
        } else if (gradeLevel2 <= 8) { // false gradeLevel >8
            result = "Middle";
        } else if (gradeLevel2 <= 12) { // false gradeLevel > 12
            result = "High";
        } else if (gradeLevel2 <= 16) { // false: gradeLevel >16
            result = "College";
        } else {
            result = "Grad";
        }

        System.out.println(result);
    }

    public static void gradeLevelMethod2(String grade) {

        String result = "";


        if (grade == "A") {
            result = "Excellent";
        } else if (grade == "B") {
            result = "Great";
        } else if (grade == "C") {
            result = "Good";
        } else if (grade == "D") {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println(result);

    }

    // create a method that can display initials of a person
    public static void initials(String firstName, String lastName) {
        char initialFirst = firstName.charAt(0);
        char initialLast = lastName.charAt(0);


//        String initialFirst = firstName.substring(0,1);
//        String initialLast = lastName.substring(0,1);

        System.out.println(initialFirst + "." + initialLast);


    }

    // create a method that can print the max number btw two numbers, if both equal then it prints "Equal"
    public static void maxNumber(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("equal");
        }
    }

    public static void initial2 (String firstName2, String lastName2){
        String initial2 = firstName2.charAt(0) + "." + lastName2.charAt(0);
        System.out.println(initial2);
    }

}



