package day34_abstraction.carTask;

public abstract class Car {
    // meant to be inherited, can't be instantiated
    // must be a parent, can't be final
// benefit is abs: parent class can ignore the details
// child class is resp to complete the m by overr.
// final or static m can't be abs, or private m

    private final String make, model; // make and model is unchangeable
    // the moment you add the final keyword you will have compiler error that's because final vars don't have default values
    private String color;
    private final int year; // car's year is unchangeable
    private double price;

    public Car(String model, String color, int year, double price) {
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

    protected final void stop(){ // chosen protected so that non-subclasses outside the package can't access the m
        System.out.println("Press the brake to stop " + make + " "+ model);
    }

    protected abstract void start(); // meant to be overr. uz without the body this m can't be implemented

    @Override
    public String toString() {
        return make +"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}

/*
warmup tasks:
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()

 */

















