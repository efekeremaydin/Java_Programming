package day26_statics;

public class IPhone {

    static public String brand = "Apple"; // yo ucan change the order of static keyword if you like but standard order is public static. This needs to be static cuz all the iphone obj brand is Apple
    public String model; // instance: diff models for iphone obj
    public String color; // instance: diff copies needed
    public double price; // diff price needed
    public static String OS = "iOS"; // one copy, one init, less mem usage. OS is same foe all iphone objs
    public static String madeIn = "China"; // all are made in China

    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true; // if all the obj of that class needs same value then static

    // to initialise inst var we need const:


    public IPhone(String model, String color, double price) { // we only use const
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){ // inst method. obj member, came from class. share everything obj and class have. can access to inst var. so if you have some static members of the class that are also shared with the inst method
        // you have to create obj to be able to use this method in another class
        // inst m accepts both static and non static
        System.out.println("Brand: " + brand); // static var. can still be accessed in the inst method
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

    }

    // inst method both accepts class and obj members. stat method only accept class members.
    // if you only use stat var then it's better to use stat methods as you won't need obj to be created and you will call it from the class

    // if you have stat method you need to ensure you wont need any inst var
    public static void printOperatingSystem(){ // in order to use inst method you need to create obj from the IPhone class
        // but if the method is static it doesnt depend on obj, so it's better if you make it static if the method doesnt depend on the obj. then method can be called from the class name
        // but if the method depends on the obj then method must be inst method
        System.out.println("Operating System: " + OS);
    }


   /* public static void printPhoneInfo(){ // if we make static, it's class member and it can't share what obj has. if it will use inst var then it needs to be inst met
        // static only accepts statics
        //System.out.println("Model: " + model); // Not possible
        //System.out.println("Color: " + color); // Not possible
    }*/


}

/*
Attributes
brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
















 */
