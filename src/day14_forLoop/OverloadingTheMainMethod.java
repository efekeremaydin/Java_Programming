package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) { // you can overload the main method but there's no point as they wont be executed

        System.out.println("a");

        main(25); // b
        main(2.05);// c
        main(true);// d


    }

    public static void main(int args){ // even though they are overloading they won't run

        System.out.println("b");
    }
    public static void main(double args){

        System.out.println("c");
    }
    public static void main(boolean args){

        System.out.println("d");
    }
}
