package day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        // this method still needs throws keyword as method1 was only handled temp below

        method1();

        Library.sleep(3.5); // this will give compile error without throws keyword and relevant Exception in the m signature above.


        // method2(); // this will still give compile error even though in method2's signature throws keywords were used.

    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000); // there are 2 ways to handle the e here, throws or try catch. throws fixes it quicker but it's temp
    }

    public static void method1() throws InterruptedException {
        // this method still needs throws keyword as below m was only temp handled above
        pauseFor5Seconds();
    }

    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First programme started");

        Thread.sleep(3000);

        System.out.println("First programme ended");

        new FileInputStream(" ");

        Thread.sleep(5000);
    }



}
