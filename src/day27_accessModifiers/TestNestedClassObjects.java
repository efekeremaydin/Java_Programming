package day27_accessModifiers;

public class TestNestedClassObjects {

//    public static class TestNestedClassObjects { // // static class only exists if there's nested class. Only INNER CLASS CAN BE STATIC

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object
        Car.CarEngine obj2 = obj1.new CarEngine();  // Car engine object
        // Since the inner class is non-stat you need to first create outer class obj to create a new CarEngine obj

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); // obj of static inner class
        // if inner class is static, you can call the inner class from outer class' name to create an obj.




















    }
}
