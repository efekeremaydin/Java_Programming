package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {


        System.out.println( 5 + 2 * 3 );
        //                  5 + 6

        System.out.println( 7 + 3 - 2 / 2);
        //                  7 + 3 - 1

        System.out.println( -5 + 3);
        //                  -2

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Phyton" || 'a' == 'A');
        //                    true == false && false || false
        //                          false && false || false
        //                              false || false
        //                                  false


        System.out.println( 100 >= 20 && 40 * 2 > 60);
        //                     100>=20  &&   80    > 60
        //                         true && true
        //                          true

        int a = 20;

        a+= 10 + 2 * 3;
        // a+= 10 + 6
        // a+= 16
        // 36
        System.out.println(a);





    }
}
