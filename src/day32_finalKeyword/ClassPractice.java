package day32_finalKeyword;

public class ClassPractice {

    public final static double PI = 3.14;
//    public final String dateOfBirth;
//    public final String firstLanguage;

    // diff btw static and final: once var is final it can't be reassigned



    public static void main(String[] args) {

        final int number = 100;
        // number = 200; // compiler error
    }

    //FINAL M
//1 cannot be overr.
    // 2 it's extra to use final keyword for static m
    // need to be placed before the return type
    // can't be applied for const.
    // final keyword is for regular m

    public class A{

        public final void method(){
            System.out.println("Java");
        }

    }

    public class B extends A{
    /*
        @Override
        public void method(){// compiler error
            System.out.println("Pyhton");
        }*/

    }


    // FINAL C
    // to prevent inheritance

    public final class Iphone{

        public void faceTime(){
            System.out.println("Facetime App");
        }
    }

   /* public class Samsung extends Iphone{
        // compiler error
    }*/

















}
