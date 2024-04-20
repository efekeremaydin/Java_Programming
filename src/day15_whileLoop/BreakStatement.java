package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) { // you need to have switch or loop


        for (int i = 0; i <10 ; i++) {
            if (i==6){ // if i is 6
                break; // exits the loop
            }
            System.out.println(i);

        }


        System.out.println("----");


        for (char i = 'A'; i <= 'Z'; i++) { // break statement forces the loop to be false. it doesnt matter if it's an inf loop

            System.out.print(i);
            if (i =='J'){
                System.out.println("loop is terminated");
                break;
             //   System.out.println("loop is terminated"); // unreachable
            }
        }

        for (;;){
            System.out.println("hello");
            break;
            //System.out.println("world"); // unreachable
        }











    }
}
