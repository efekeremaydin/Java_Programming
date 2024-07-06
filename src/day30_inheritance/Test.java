package day30_inheritance;

public class Test {

    
    public static void main(String[] args) {


        String reverse = "abc";
//        System.out.println(reverse.toCharArray());
//
//        char[] reverse2 = reverse.toCharArray();
//
//        System.out.println(reverse2);

        String reverse2 = "";

        for (int i = reverse.length()-1; i >=0; i--){
            reverse2+= reverse.charAt(i);
        }

        System.out.println(reverse2);




    }
}
