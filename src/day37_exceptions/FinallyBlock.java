package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
            // System.exit(1);
        }finally {
            System.out.println("finally block");
        }

        try{
            System.out.println(9/0);
        }catch (NullPointerException e){
            System.out.println("Nullpointer Exception has been caught");
            e.printStackTrace();
        }finally {
            System.out.println("finally block");
        }

    }
}
