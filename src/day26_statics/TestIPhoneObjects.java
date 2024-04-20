package day26_statics;

public class TestIPhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 12", "Black", 1000);

        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.model);

        iPhone.printPhoneInfo(); // obj came from class. if the class has own members then the class mem can be shared with all members. obj can share class members

        // static var and met called thru obj but this is not the way to do it as statics belong to the class not to the obj
        System.out.println(iPhone.brand); // statics are shared by all the obj. this step is unnecessary. you don't need the obj.
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();

        // right way, access via class name:
        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();

        // instance: thru obj
        // static: thru class


    }
}
