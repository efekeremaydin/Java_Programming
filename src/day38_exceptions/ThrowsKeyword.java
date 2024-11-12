package day38_exceptions;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException { // throws wouldn't handle the exception here as it's unchecked

/*        System.out.println("Programme1 started");

        try {
            System.out.println(100 / 0); // unchecked exception
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try { // disadv of using try catch here is having too many lines of code for one checked exception. For these kind of scenarios throws is better.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programme1 ended");

        System.out.println("---");

        System.out.println("Programme2 started");

        try {
            System.out.println(100 / 0); // unchecked exception
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programme2 ended");*/

        System.out.println("Programme1 started");

            Thread.sleep(5000);

        System.out.println("Programme1 ended");


    }


}
