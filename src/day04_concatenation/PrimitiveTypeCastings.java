package day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {


        // --------- Implicit Casting ------------

        byte a = 15;
        short b = (short)a; // smaller primitive casted to larger automatically

        int c = a; // implicit casting

        long d = 3000L;

        float f = d; // implicit casting

        // --------- Explicit Casting ------------

        int x = 100;
        byte y = (byte)x; // TIP: in the parenthesis always give the same type you want it to cast it to

        float z = 20.8F;

        short q = (short)z; // z = 20.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2);

        System.out.println("--------------------------");

        int num = 500;
        byte result = (byte) num;

        System.out.println(result);

        int r = 50000;
        short t = (short)r;

        System.out.println(t);

        System.out.println("----------");

        double u = 3000.5;
        int p = (int)u;

        System.out.println(p);

        int o = 100;
        double d1 = o;

        System.out.println(d1);





    }
}
