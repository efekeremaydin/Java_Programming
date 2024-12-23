package day38_exceptions;

import utilities.Library;

public class Test {

    public static void main(String[] args) {

        Library.sleep(3.5); // since we didn't use try catch in the sleep m (initially), we still need to handle the exception here. hence it's better to use try catch for these kind of cases.


    }
}
