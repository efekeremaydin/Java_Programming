package day27_accessModifiers;

public class StaticInitializationBlock {

    /*public static int a = 100; // same value shared by all the objs
    public static double b = 10.5;
    public static String c = "Java"; // in the future you will learn some diff data types, stat var, so you have multiple steps to set the static var. and you can't assign here right away.
*/

    // if you need multiple steps to assign var to static, then you need a block to init it:

    public static int a;
    public static double b;
    public static String c;

    // public static ExcelSheet sheet; // read, get file and get the sheet => 3-4 steps.

  /*  static { // as soon as you call the class static block gets exec first.
        // you can give any code frag.
        a = 100;
        b = 20.5;
        c = "Java";

    }*/

    // constructor
    public StaticInitializationBlock(){ // we don't need arg as all var will have same value

        //when this contract get exec these var will be set
        a = 100;
        b = 20.5;
        c = "Java";
    }

    /*public static void main(String[] args) {

        a = 100;
        b = 20.5;
        c = "Java";

    }*/










}
