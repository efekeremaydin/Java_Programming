package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    // init var everytime obj from this class created
    // const gets exec when you create the obj but it's not the only one
    // besides the const we have inst init block

    // you can't pass parameters for inst init block
    // it can only init some known data


    /*{
        name = "James"; // inst var name, this block gets exec for all obj. default name will be James. if you want to change you have to call var to change
        age = 20; // default age will be 20
    }
*/
    // ***only time you need this is if you want to use inst init block is when you want to set inst var def values
    // ***so for example if you dont set any value to inst var they will be printed as null. if you want to set diff default values then you can use inst block

    public InstanceInitializationBlock(String name, int age) { // you can decide what to set to these variables
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {

       /* InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();
        System.out.println(obj1.name);
        System.out.println(obj2.name); */

        // inst block gets exec whenever the obj is created
        // if you want to store diff names for each obj then you can't use inst init blcok
        // only time you use will be using inst block is for deafult val
        // if you want to set the inst var for each obj separately then you need to use const
        // const you can pass param./args - you can assign any age
        // inst block is not best practice.

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James", 25); // const allows you to set diff data to diff objs. inst block you will have def values
        // ***const is the best option to init inst var
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron", 28);

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }

}
