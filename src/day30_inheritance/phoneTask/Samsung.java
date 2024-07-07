package day30_inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung(String model, String size, double price, String color){
        super("Samsung", model, size, price, color);
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " freezes a lot");
    }

}

/*
2.2 Samsung:
					Extra methods:
						freeze()
 */
