package day27_accessModifiers;

// import day27_accessModifiers.StaticInitializationBlock.*; // since it's same package you don't need import statement.
public class Test {

    public static void main(String[] args) {

        new StaticInitializationBlock(); // once you create the obj then the stat var will be set in the const
        // then when you call the var you will get the values
        // but this is not a good choice. you should never init statics in const

        // if you create 10 obj then these code frag will be get exec 10 times to init stat var.
        // stat we need to init one time
        // best use for stat var is the stat block, regardless of how many steps
        // whenever you have inst var use const

/*
        StaticInitializationBlock s1 = new StaticInitializationBlock();

        System.out.println(s1.a);
*/



        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println(StaticInitializationBlock.c);

        // as soon as you call the class the static class gets executed, just one time. it won't exec any other time if you call one more time.

        // if you don't have the static block, the values won't be executed automatically. In case they are in the main method the main method needs to be called first to exec these values.

        // init the static var in any other method is not a good choice. cuz you won't be able to use the data properly.

        // Static var are called by the class name

        // once the class is called the static block gets executed automatically, then you can access any stat members of the class.

        // you never go wrong if you use the static block to init the stat var


        System.out.println("---");

        System.out.println(AccessModifiers.publicDate);// within the same package, accessible
        System.out.println(AccessModifiers.protectedDate); // within the same package, accessible

        System.out.println(AccessModifiers.defaultData); // accessible within the same package

//        System.out.println(AccessModifiers.privateData); // NOT ACCESSIBLE

        new AccessModifiers();

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
//        AccessModifiers.privateMethod(); // NOT ACCESSIBLE



    }













}
