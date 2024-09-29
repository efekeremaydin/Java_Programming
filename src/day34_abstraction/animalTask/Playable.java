package day34_abstraction.animalTask;

public interface Playable {

    //boolean isFriendly;
    // this will give compiler error as it doesnt have final value (and this can't be non-static)

    boolean isFriendly = true; // static and final and public by default and you can't change the access mod

    // below are optional but every interface must have abs m
    /*
    private static void main(String[] args) { // after Java 9, private access mod was also allowed for static methods
        //isFriendly = false; // ce as you can't reassign value to a final var (THIS IS HOW YOU PROVE IT'S FINAL VAR)
        System.out.println(isFriendly); // you can print a static var from a static m (THIS IS HOW YOU PROVE IT'S STATIC VAR)



    }

    // interface can't have instance m
    //public void method1(){};

    default void method1(){}; // this becomes an instance m in subclasses when inherited
*/


    //public abstract void play(); // no need to declare public and abs
    void play();





















}
