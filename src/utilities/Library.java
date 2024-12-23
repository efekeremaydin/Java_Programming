package utilities;

public class Library {

    public static void sleep(double seconds) {

        //Thread.sleep((long)seconds*1000L); // this method requires long so it's casted to long here.

        try {
            Thread.sleep((long)seconds*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
