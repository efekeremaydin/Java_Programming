package day36_polymorphism;

import java.util.Arrays;

public class IPhone2 {

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

    public IPhone2(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting to " + phoneNumber);
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

  /*  @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone2)) {
            System.err.println("Invalid entry");
            System.exit(1);
        }
        if (model == ((IPhone2) obj).model && color == ((IPhone2) obj).color ) {
            return true;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IPhone2)) { // if the given obj is not iphone
            System.err.println("Invalid obj, obj must be IPhone2: " +obj);
            System.exit(1);
        }
        if(obj instanceof IPhone2){ // if the given obj is iphone
            if (model.equals(((IPhone2)obj).model)){ // if the model of the iphone is same as the given iphone model
                if (color.equals(((IPhone2)obj).color)){ // if the color of the iphone is same as the given iphone color
                    return true;
                }
            }
        }
        return false;
    }
}
