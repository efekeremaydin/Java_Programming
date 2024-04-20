package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        //new GarbageCollection().finalize();

        String s1 = "Java";
        s1 = null; // simplest way to be collected by GC // doesnt take any mem usage. // this means there's no object for s1.
        // you can't call Java now. Java is eligible for GC. It will collect it and destroy it.




        System.out.println(s1);
//        System.out.println(s1.toUpperCase()); // NullPointerException
//        System.out.println(s1.replace(null, "Python"));// NullPointerException

        System.out.println("----");

        // another way
        String a = ""; // this still exists
        String b = null; // this doesnt exit

        System.out.println("----");

        String str1 = "Python"; // will be collected by GC. once it's collected you can't get it again.
        //     stack    heap (String pool)
        str1 = "CYDEO";

        System.out.println(str1);

        System.out.println("-----");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "black");

        Dog dog2 = new Dog(); // only final keyword prevents GC to collect the GC eligible items
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        // dog1 = null; // one way for GC: by nulling the ref

        // another way for GC: by assigning a ref to another obj
        dog1 = dog2; // this will assign dog2 to dog1. after this line dog1 will be null and eligible for GC

        System.out.println(dog1);
        System.out.println(dog2);

        // new Dog().finalize(); you dont need to use this, only GC uses this method implicitly
        // dog1.finalize(); in this case dog1 will be finalised like this implicitly as dog 2 is assigned to it above.





















    }
}
