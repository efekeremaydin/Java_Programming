package day30_inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String size, double price, String color){
        super("Nokia", model, size, price, color); // only a const call another const
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " can be used for self defense");
    }


}

/*
2.3 Nokia:
					Extra methods:
						selfDefense()
 */
