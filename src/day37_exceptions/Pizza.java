package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        return 2*numberOfCheeseTopping + 1.5*numberOfPepperoniTopping;
    }

    @Override
    public String toString() { // moverr -> runtime pm
        // what decides which m will get executed? based on object type. if this is called from Pizza object then that method will get executed.
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // ref type is Object so that any obj can be used via pm
        if(!(obj instanceof Pizza)){ // if the specified obj is not pizza
            System.err.println("Invalid object " + obj);
            System.exit(1);
        }

        Pizza pizzaD = (Pizza) obj; // if you need to use downcasted obj more than once it's better to assign it to a var.
        // ref type decides what's accessible.
        if(obj instanceof Pizza){
            if (size == pizzaD.size){
                //if (numberOfCheeseTopping ==  pizza.numberOfCheeseTopping){
                    if (numberOfPepperoniTopping == pizzaD.numberOfPepperoniTopping){
                        return true;
                    }
                }
            }
        return false;
    }
}
/*
	1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object
 */
