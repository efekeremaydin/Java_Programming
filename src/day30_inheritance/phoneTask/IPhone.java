package day30_inheritance.phoneTask;


public class IPhone extends Phone { // IPhone IS A Phone
    // calling the parent class const in sub class is a MUST
    // if the parent class has default const then it will be done implicitly
    // if not then it needs to be done explicitly
    // only a const can call other const

//    public IPhone(){
//        super("","","",1, "");
//    }

    public IPhone(String model, String size, double price, String color){ // IJ can create this code but it wouldn't know which arg is unnecessary (brand)
        // you have to pass the same args of the parent class here (minus brand, see below)
        //this(); // this is for calling the const within the same class
        super("Apple", model, size, price, color); // brand is known so i dont have to ask for that here.
        //this(); // one const can only call one const.
    }


    public static boolean hasApplePay = true; // if you want to add this to the toString then you need to override it
    public void faceTime(long phoneNumber){
        System.out.println(getModel() + "facetiming with " + phoneNumber);
    }
    public void faceTime(String email){ // overload
        System.out.println(getModel() + "facetiming with " + email);
    }







}

/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */