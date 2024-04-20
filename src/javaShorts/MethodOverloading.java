package javaShorts;

public class MethodOverloading {
    public static void main(String[] args) {

        int total = sum(1,2,3);
        System.out.println(total);


    }

    public static int sum (int a, int b){
        return a +b;
    }
    public static int sum (int a, int b, int c){
        return a +b+c;
    }
    public static int sum (int a, int b, int c, int d){
        return a +b+c+d;
    }






}
