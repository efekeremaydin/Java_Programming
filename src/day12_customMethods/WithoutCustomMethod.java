package day12_customMethods;

public class WithoutCustomMethod {
    public static void main(String[] args) {

        // without custom method you need to repeat the same steps over and over again
        int num1 = 90;
        if (num1 %2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        int num2 = 11;
        if (num2 %2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        int num3 = 44;
        if (num3 %2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        int num4 = 567;
        if (num4 %2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    public static void oddOrEvenNumber(int number) {

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }


}
