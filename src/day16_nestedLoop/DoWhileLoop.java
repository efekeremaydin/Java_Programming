package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {



        boolean condition = false;
        for (; condition ;){
            System.out.println("Hello Cydeo -- for loop");
        }

        System.out.println("---");
        while (condition){
            System.out.println("Hello Cydeo -- while loop");
        }


        System.out.println("---");

        do { // rare use case. special scenarios
            System.out.println("Hello Cydeo -- do while loop");

        }while(condition);






    }
}
