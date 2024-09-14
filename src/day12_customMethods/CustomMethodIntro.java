package day12_customMethods;

public class CustomMethodIntro {

    public static void main(String[] args) { // main METHOD. in order to run the file. whichever code you give it's run top to bottom. public is access mod. static is static mod. void is indicating that whatever value is within the method body. main is method name. you then have para. in para. you have String [] array and args. after para you give curly braces.

        // this is building method. if i want to create own method, you can't create in side. it can't be in the same curly braces. you can't create outside of class too.

        System.out.println("TestCydeoDevObject started");

        greetings();
        helloWorld();

        System.out.println("TestCydeoDevObject completed");


    }

    public static void greetings (){
        System.out.println("hello everyone");
        System.out.println("how are you today");
        System.out.println("Are you ready to learn Java");
    }

    public static void helloWorld (){ // must be declared within the class
        System.out.println("Hello world");
        System.out.println("I love Java");
    }
























}
