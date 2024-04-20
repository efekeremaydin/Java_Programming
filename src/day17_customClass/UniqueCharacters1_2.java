package day17_customClass;

public class UniqueCharacters1_2 {

    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";
//        System.out.println(str.indexOf(0));
//        System.out.println(str.lastIndexOf(0));


        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);
            if ((str.indexOf(each) == str.lastIndexOf(each))){ // if the first time char appeared same as last time appeared
               unique += each;
            }
        }
        System.out.println(unique);

      /*  for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);
            if (str.indexOf(i) == str.lastIndexOf(i)){ // this is wrong as you need to pass char inside the index of method, so this one always gives you -1 and makes the cond true
                unique+=each;
            }

        }
        System.out.println(unique);*/


    }
}

/*
   for (int i = 0; i < str.length(); i++) { // i: index numbers of str
           char each = str.charAt(i);
           if (str.indexOf(i) == str.lastIndexOf(i)){
               unique+=each;
           }

        }
        System.out.println(unique);
 */