package day32_finalKeyword.carTask_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;
    //private static int numberOfWheels;
    // no need to encapsulate the static vars as it's public to everyone
    public static int numberOfWheels;
    //private static boolean hasBattery = true;
    public static boolean hasBattery;

    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName()); // setting the class name to the make of the car. so that when we create the obj less arg we need to provide
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);

        // explanation below:
//        hasBattery = true;
//        numberOfWheels = 4;
    }

    static { // it's better to init statics from here as it will only be initialized 1 time, so no need to add to the const
        hasBattery = true;
        numberOfWheels = 4;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public void setYear(int year) {
        if (year <= 0) { // if specified year us neg or zero
            System.err.println("year can not be negative or zero " + year);
            System.exit(1); // terminates the programme
        }
        this.year = year; // if above is true then this won't be set
        // in order for this inst var to be set above cond needs to be false
    }

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }

//    public static boolean isHasBattery() {
//        return hasBattery;
//    }

//    public static void setHasBattery(boolean hasBattery) {
//        Car.hasBattery = hasBattery;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) { // if specified price is neg or zero
            System.err.println("price can not be negative or zero" + price);
            System.exit(1);  // terminates the programme
        }
        this.price = price; // if the above is true then this inst var won't be set, otherwise it will be set
    }

    public void start() {
        System.out.println("Press the brake and twist the key to ignition to start  " + make + " " + model);
    }


    @Override
    public String toString() {
        return make + "{" + // you can directly add make as it's getting the class name in the const.
                //", make='" + model + '\'' + // you don't need it as it's already above
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }


}

/*
1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


	2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

            2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k






 */
