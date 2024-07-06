package day30_inheritance.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() { // even if you don't have conditions use getter and setters to ensure you can set conditions at a later stage
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      if (price<=0){
          System.err.println("Invalid price: "  +price);
          System.exit(1);
      }
       /* if (price == 0 || price < 0){
            System.err.println("Price cannot be zero or negative");
            System.exit(0);
        }*/
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color: " + color + "\ncolor can only be " + Arrays.toString(colors));
            System.exit(1);
        }

        /* if (!color.equals("Black") || !color.equals("White") || !color.equals("Silver") || !color.equals("Gold") || !color.equals("Pink")){
            System.err.println("Invalid color");
            System.exit(0);
        }*/

    }

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    private void call(long phoneNumber){
    }
    private void text(long phoneNumber){
    }

    public String toString() {
        return getClass().getSimpleName() + "{"+ // these methods will ensure that appropriate class name is used when this method is inherited
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
	1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */