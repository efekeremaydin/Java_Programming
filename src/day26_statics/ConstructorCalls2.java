package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){// default
        //this(1);// recursion is not allowed since this c calls the int c and int c calls this c
        System.out.println("Default");
    }

    // def c linked/chained to the int arg c and that chained to the String arg c
    public ConstructorCalls2(int a){ // default const, then int arg
        this(); // calling the def const.
        // this("A"); // cannot call more than one const
        System.out.println("int arg");
        // this(); // must be the first step
    }

    public ConstructorCalls2(String a){ // def, int arg and String arg
        this(1); // calling the c with int arg
        System.out.println("String arg");
    }


    // more c means more options.

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2();

        System.out.println("----");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);

        System.out.println("---");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");

    }








}
