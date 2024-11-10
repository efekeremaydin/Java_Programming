package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Programme1 started");
        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
            System.out.println("Try block executed");
        }catch (RuntimeException e){
            // printStackTrace() is inherited from RuntimeException class.
            //e.printStackTrace(); // display the full details of the exception after the execution of the programme
            System.out.println(e.getMessage());
            System.out.println("Catch block executed");
        }
        System.out.println("Programme1 ended");

        System.out.println("---");

        System.out.println("Programme2 started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try block executed"); // if try block can handle it the exception obj will be gone (garbage collection)
        }catch (RuntimeException e){ // but if try block can't catch it then it will be caught by catch block during the runtime.
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Catch block executed");
        }

        System.out.println("Programme2 ended");

        System.out.println("---");

        System.out.println("Programme3 started");

        try {
            FileInputStream file = new FileInputStream(""); // this class has throws keyword in the signature that's why it throws exception
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
          e.printStackTrace();
        }

        System.out.println("Programme3 ended");


        System.out.println("---");

        System.out.println("Programme4 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("Programme4 ended");

    }
}
