package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Programme1 started");

        try{
            System.out.println(9/0); // Arithmetic exception (unchecked)
            // Arithmetic exception obj created in line 11 but if m of catch block doesn't pass a class that has IS-A rel. with Arith. e. then it can't catch it
            //
            System.out.println("Try block");
        }catch(ArithmeticException e){ // requires parameter. this is cuz if in case try block can't catch the exception, exception obj will be passed to the catch block. So the param. should be ref to the exception obj above.
            // every time we see an exception thrown on the console an obj of the relevant class is created. so an argument has to be placed into the catch block if try block can't handle it.
            //System.out.println(e);
            System.out.println("Catch block executed");
        }

        System.out.println("Programme1 ended");

        System.out.println("---");

        System.out.println("Programme2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase()); // unchecked exception
            System.out.println("Try block executed");
        }catch(RuntimeException e){// Exception or Throwable can also be used by not preferred as it will check all the subclasses one by one, so not efficient.
            System.out.println("Catch block executed");
        }

        System.out.println("Programme2 ended");

        System.out.println("---");

        System.out.println("Programme3 started");

        try{
            Thread.sleep(3000); // checked exception. this time you would know which exception class you need to use.
            System.out.println("Try block executed");
        } catch(InterruptedException e){ // after the exception is caught during runtime, the exception will be assigned to the ref var. so if you want to print out about the exception occurred during the runtime then you can use: printStackTrace() m. for full details of the exception. OR getMessage() which prints the exception message only.
            //e.printStackTrace();
            System.out.println("Catch block executed");

        }


        System.out.println("Programme3 ended");






    }
}
