package day16_nestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon" + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon" + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon" + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon" + i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon" + i);
        }

        System.out.println("---");

        for (int i = 0; i < 5; i++) { // i: 0
            //when this outer loop runs 1 time inner loop will run 5 times
            System.out.println("===");
            for (int j = 0; j < 5; j++) { //
                System.out.println("Wooden Spoon" + j);

            }
        }





    }
}
