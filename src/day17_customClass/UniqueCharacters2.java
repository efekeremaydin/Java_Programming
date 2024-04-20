package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char ch = str.charAt(i); // this will assign the char of the given index number to ch so that it will be compared with other loops one by one to check if they are unique or not

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch){ // this will compare if the char of the given index number of the str equals to above assigned ch char (e.g. first one comparing if ch = a equals to a)
                    count++;
                }
            }
            if (count ==1 && !(unique.equals(""+ch))){
                unique+=ch;
            }
        }
        System.out.println(unique);





    }
}



/*
1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd
 */