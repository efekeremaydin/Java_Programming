package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Programme1 started");

        Car car = null;

        try {
            car.drive(); // NullPointerException
        }catch (ArithmeticException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ClassCastException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e) {
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        System.out.println("Programme1 ended");
    }
}
