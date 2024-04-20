package day18_garbageCollection;

import day17_customClass.Employee;

class Car{ // there can only be one public class

    public String brand;
    public String colour;
    public String model;
    public int year;


}


public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack. local var. a and 100 in stack

        Car car     =    new   Car();
        //  stack (ref)     heap (obj) brand colour and model are created but null. year is created but 0.

        System.out.println("----");

        Employee employee1 = new Employee(); // room
        //                      heap
        Employee employee2 = employee1; // obj is one in heap but there are 2 ref var.
        //      door (stack)

        employee1.setInfo("Rehane", 30, 'F', "Java dev", 95000, "A12");
        System.out.println(employee1); // same objects
        System.out.println(employee2); // same objects, only one copy.

        System.out.println("---");

//        String batch1 = new String("Java");
//        String batch2 = new String("Java");
//        String batch3 = new String("Java");

        // less mem usage
        String batch1 =     new String         ("Java"); // room
        //      Stack   heap outside pool         String pool
        String batch2 = batch1; // ref var stack
        //      door
        String batch3 = batch1; // ref var stack
        //      door


    }

    public static void method1(){ // stack

        int b = 200; // stack. local var. b and 200 in stack.

    }

    public static void method2(){ // stack

        String c = "Hello World"; // c is local/ref var. stack. ref var cuz it's ref an object. c is in stack. String object will be in heap. String pool. Still inside the heap.

        String d = new String("Hello World");
        //    stack     heap. outside the String pool. inside the heap.

    }



}


