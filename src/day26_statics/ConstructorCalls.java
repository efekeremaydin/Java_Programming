package day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this(); error
        // this(9); error - cannot call contain itself, recursion not allowed
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){ // overload
        this(); // this is to call constructor. has to be at the first step
        // this.: call for instance var or methods.
        // this(): calling for constructors in another constructor. Can only be used in another constructor. only the const can call other const.

        //ConstructorCalls(); // compiler error, you cannot call the constructor by its name in another constructor

        //they are special.
        // Constructor call:
        // 1. cannot be called by its name. You have to use this() keyword.
        // 2. Only a const can call another const.
        // 3. This should always has to be the first step.
        // 4. Once const cannot call more than one const.
        // 5. Cannot call or contain itself

        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this();
        //this(2.5); // compiler error. there's a limit: one const cannot call more than one in its body.
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

        System.out.println("---");

        method2();

        System.out.println("---");



    }


    // they are also methods and they can call each other

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
        method2(); // regular methods can call itself
    }













}
