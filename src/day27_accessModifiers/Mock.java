package day27_accessModifiers;

public class Mock {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {-1, -2, -3};
        int[] c = {};


        try{

        int result = maxNumber(a);
        System.out.println(result);

        System.out.println(maxNumber(b));
        System.out.println(maxNumber(c));
        System.out.println(maxNumber(null));

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }


    public static Integer maxNumber(int[] a) {
        if (a == null || a.length == 0) {
            //return null;
            throw new IllegalArgumentException("can't be null or 0");
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

}


// write a m that takes int array and return max number