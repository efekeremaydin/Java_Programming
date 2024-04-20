package day18_garbageCollection;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    double totalCost = 0;

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {

        switch (size) {
            case 'S':
                totalCost = 10 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
                break;
            case 'M':
                totalCost = 12 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
                break;
            case 'L':
                totalCost = 24 + (2 * (numberOfCheeseTopping + numberOfPepperoniTopping));
            default:
                break;
        }
        return totalCost;


    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping + ", Total Cost: " + calcCost() + "}";
    }

}

/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */
