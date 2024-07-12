package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("IPhone 12", "Pro Max",1234, "Black");

        Samsung samsung = new Samsung("Galaxy", "M", 1234, "Silver");

        Nokia nokia = new Nokia("3310", "M", 1234, "White");

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123123);
        samsung.text(123123);
        nokia.text(123123);

        System.out.println("---");

        iphone.faceTime(1231231);
//        samsung.faceTime(12312); unique for iphone
//        nokia.faceTime(12312);

        samsung.freeze();
//        iphone.freeze();
//        nokia.freeze();

        nokia.selfDefense();
//        iphone.selfDefense();
//        samsung.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);














    }
}
