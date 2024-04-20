package utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data; // this import statement imports the whole Data class so you can access both static and inst members
// this imports everything

// what if you only need a couple static members?
// then above import is not necessary

// better way is just to import what you need

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data(); // create an obj via const
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();


        System.out.println("---");

        System.out.println(AccessModifiers.publicDate); // same class, package or outside the package, it's accessible

//        System.out.println(AccessModifiers.protectedDate); // NOT ALWAYS accessible outside the package. ONLY accessible if it's a subclass

//        System.out.println(AccessModifiers.defaultData); // NOT ACCESSIBLE (NEVER)

//        System.out.println(AccessModifiers.privateData); // NOT ACCESSIBLE (NEVER)

        new AccessModifiers();

        AccessModifiers.publicMethod();
       //  AccessModifiers.protectedMethod(); // NOT ALWAYS ACCESSIBLE, it needs to be a SUBCLASS
       //  AccessModifiers.defaultMethod(); // NOT ACCESSIBLE
//        AccessModifiers.privateMethod(); // NOT ACCESSIBLE




    }


















}
