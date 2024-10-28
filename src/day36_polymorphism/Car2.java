package day36_polymorphism;

public abstract class Car2 {

    private final String make, model; // make and model is unchangeable
    // the moment you add the final keyword you will have compiler error that's because final vars don't have default values
    private String color;
    private final int year; // car's year is unchangeable
    private double price;

    public Car2(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        if (year < 1886) { // since there's not setter for the year conditions can be given here
            System.err.println("invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) { // if you give this condition in the c then you won't be able to independently change the price after you set the c
            System.err.println("invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop() { // chosen protected so that non-subclasses outside the package can't access the m
        System.out.println("Press the brake to stop " + make + " " + model);
    }

    protected abstract void start(); // meant to be overr. uz without the body this m can't be implemented

    @Override
    public String toString() {
        return make + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car2)) {
            System.err.println("Invalid");
            System.exit(1);
        }

        if (obj instanceof Car2) {
            if (make.equals(((Car2) obj).make)) {
                if (model.equals(((Car2) obj).model)) {
                    if (color.equals(((Car2) obj).color)) {
                        if (year == ((Car2) obj).year) {
                            if (price == ((Car2) obj).price) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}