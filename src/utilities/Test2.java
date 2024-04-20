package utilities;

//import day27_accessModifiers.Data; // this is not necessary
// import static day27_accessModifiers.Data.d;
// import static day27_accessModifiers.Data.method3;

import static day27_accessModifiers.Data.*; // for all stat members
// once you have this you don't need above statements

// when you call static members of utility classes you will need static import

// this will make the code more efficient
// less mem usage


public class Test2 {

    public static void main(String[] args) {

        //System.out.println(Data.d);
        System.out.println(d); // you can just call the var due to static import above
        method3();

        System.out.println(e);
        System.out.println(f);
        method4();


// inst var and m not imported
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

        //method1();
        //method2();


    }





}
