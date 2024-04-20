package day17_customClass;

public class Dog { // each object here will have their own attributes and actions
    // always accesssible cuz it's public , and everything below is public

    // no main method in this class, this class is to act as a blueprint for all dog objects

    public String name; // we will set this in the objects.
    // instance variable.
    public String size;
    public char gender;
    public int age; // different colors that's because we already created them elsewhere
    public String breed;
    public String colour;

    // setInfo method is also instance as we need multiple copies for each object
    public void setInfo(String name, String breed, char gender, int age, String size, String colour){ // to set the info for the instance vars, it needs these parameters above. in order to make readable, they should be same as instance vars names.
        //name = name; // this cannot be used as name is a local var already, but we need the instance var to be reassigned.
        // these are just parameters, above. we need to make sure that arguments can be set as attr (instances) of the dog
        // this method helps us to not to write everything in TestDogObject class when writing a dog object
        this.name = name; // this keyword is used for calling instance var name
        this.breed = breed; // i can only call instance var by using this keyword
        this.gender = gender;
        this.age = age; // this will ensure the given argument will be set to instance var above
        this.size = size;
        this.colour = colour; // this keyword means this class instances.


    } // this method can help us to set all info of the dog at once

    //these are attributes of the Dog class
    // every obj has own mem
    // we also have actions - methods like eat sleep drink play
    // these methods need to be instance as each dog they need to have their own actions. If you call from first dog only first dog will be drinking, compared to static method.

    // default value of String is null. we have to declare all var otherwise thay will be null.

    // actions

    // two options: static or instance
    // if STATIC > each object they CANNOT have separate copy of each action

    // eat from first dog obj > i only expect first dog to eat
    // that's why they have their own method
    // if it's not instance > they will all have the same actions once called
    // so you don't give static specifier
    // if you dont want the own methods then you can give STATIC
    // own eat method > only the mentioned dog should be eating
    // each obj to have sep copy of that method then you need INSTANCE method. you don't include STATIC
    // For now we usually create INSTANCE
    // instance means multiple copies

    public void eat() { // they belong to the object. only thru object you can call them
        // this has to be instance method also bec it has instance var
        System.out.println(name + " is eating");
    }

    public void drink() { // you can also give parameters here
        System.out.println(name + " is drinking");
    }


    // every single class they have to server the objects
    // so you need to analyse what the objects should have

    // INSTANCE means instances for each object
    // when you create the objects sep copies will be created

    // any other object you want to create you can create custom class for that


    // toString method:
    // built-in method for converting any objects to String so we can print on the console. otherwise any obj that you create from this class you won't be able to print
    // instance method
    // return type is String
    // name can't be changed: toString
    // whatever string inside will be printed
    // always required whenever you print an obj

//    public String toString (){
//        return "Dog Name: " + name + ", Dog Gender: " +gender;
//    }

    //shortcut > right click > generate... > toString


    // this method is also instance as we need multiple copies for each object
    public String toString() { // to avoid getting a hash-code when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
