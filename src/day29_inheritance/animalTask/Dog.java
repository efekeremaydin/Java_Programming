package day29_inheritance.animalTask;

public class Dog extends Animal{ // is a rel. Dog IS AN Animal. ALL Char. of Animal are inherited to the Dog
    // it's not only extending to Animal it's also extending to Object
    //      Child        Parent
    // one in the LEFT side of EXTENDS keyword is child
    // one in the RIGHT side of EXTENDS keyword is parent
    // Child becomes richer. They don't need to create all the hard work that Parent did. They inherit.
    // IMPORT is borrowing, everything still belong to the other class. EXTEND is having, everything become the member of this class.

/*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        // these are mem of Dog class now
        // if it was important you could not say that these are members of the Dog class

        setInfo();
        eat();
        drink();
        sleep();
        toString();
        bark(); // Animal class doesnt have bark method
    }

 */

    public void bark(){ // if you added this m to Animal class then all animals would be barkin
        //THAT'S WHY IF A METHOD IS NOT FOR ALL THE SUBCLASSES THEN YOU SHOULD NOT ADD IT TO THE SUPER CLASS
        System.out.println(getName() + " is barking");

    }











}











/*
7 var
5 met
inherited
 */





























