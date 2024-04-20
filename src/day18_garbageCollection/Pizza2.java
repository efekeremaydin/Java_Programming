package day18_garbageCollection;

public class Pizza2 {

    public char size; // inst var
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    // ca;c tje total cost of the pizza and returns it as double
    public double calcCost() { // since it's an instance method and instance var are created above, you don't need parameters.
        double totalPrice = 0;

        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.err.println("Invalid size: " + size);
                break;
        }

        return totalPrice;

    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    // displaying the pziza info whenever pizza is printerd
    public String toString() {
        return "Pizza2{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';


    }


}
