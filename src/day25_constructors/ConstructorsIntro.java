package day25_constructors;

public class ConstructorsIntro {
    // currently, there is also const here but hidden/default/no args. as it's a must

    // constructor. no return type or specifiers. we defined. if you define yourself compiler doesnt define. Only time it defines is if you dont define.
    // Advantage is you can determine how the object is created.
    //public ConstructorsIntro(){
       // System.out.println("Object is created by using default constructor"); //every time you exec the constructor to create the obj this code frag will also be exec.
        // only time constr get exec is when you create the obj
        // when you create the below obj above code frag will also get exec.
        // if you have some certain steps that you have to do for every single obj then yo uca nplace them in the const body. then everytime you create the obj it will create that code frag. auto.
        // you will be able to set all the instances as well when you create obj. instead of setInfo which you need to initial manually. so const is easier.

        // either no args. or parameterized.
        // if you have one const only you need to use that const only. if you have multiole, then you have options.
    //}

    public ConstructorsIntro() { // if a class has 2 const. you have 2 options, you can choose. whichever yo uuse that's get exec. each time obj created const get exec separately
        System.out.println("Object is created by using no argument constructor");
    }
    public ConstructorsIntro(int a) {
        System.out.println("Object is created by using int argument");
    }

    // multiple const in class
    // const name must be same
    //public A(){}// this is not a const

    //public ConstructorsIntro(int a){} // can't pass the same param.

    //public ConstructorsIntro(){ // you have to overload the constructor, that's the only way you can have more than 1 const.
        // when first covered method overload, which can't be overloaded?
        // NONE. every single method can be overloaded.
        // Const is still a method. you can always overload.





    // regular method
    public void add(){

    }

    public static void main(String[] args) {

        //new ConstructorsIntro(); // no arg const.
        // you're allowed create the object here as you have the const above.
        // most of the time you should define the constructor
        // const that compiler define has no code fragments in its body
        // each class can have as many const you want
        // nothing will get executed if you just run this
        // if there's not action there's no point to keep that const.
        // i should define the const and determine the code frags.



        ConstructorsIntro obj1 = new ConstructorsIntro(10); // this will give error if youd don't pass param.

        // if you define the const yourself compiler wont.
        // const can be set auto even though we don't call it


        ConstructorsIntro obj2 = new ConstructorsIntro();
        // ConstructorsIntro obj3 = new ConstructorsIntro("Java"); // you can't create this as you dont have String arg const.

        // it gets exec 3 times cuz each obj has diff mem

        // even tho you use the same const mem allocation is diff mem alloc is different const has to run sep for each obj. if the cosnt has to run sep, you can then use const instead of setinfo method.

        // const only gets exec when u create the obj


















    }
}
