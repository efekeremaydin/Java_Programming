package day27_accessModifiers;

public class StaticBlock {


    public StaticBlock(){ // this will get executed 3 times as there are 3 objects
        System.out.println("Constructor");
    }


    public static void main(String[] args) { // main m will get exec 1 time

        System.out.println("Main Method");

        new StaticBlock(); // when we get this line const will get exec
        new StaticBlock();
        new StaticBlock();

        // as soon as the class exec first thing is static block, only once.
        // as soon as we create the object, constructor gets created
    }




    // b4 J8 this was runnable. after J8 it is no longer possible. you need main method.
    // this will get exec first, regardless of the line order
    // this doesnt depend on any obj
    static { // static block will get executed once, that's why it's called static init block
        // one value will be shared by all the objects
        // if you have only one value that you need to init to static var, then use static block
        // static block is init one time for all the obj
        // we could use static block for init static var as well
        System.out.println("Static Block");
    }












}
