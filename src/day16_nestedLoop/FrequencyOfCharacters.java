package day16_nestedLoop;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCCCCDDDDD";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch){
                    count++;
                }
                if (count ==2 && !(result.contains(""+ch))){
                    result += ch;
                }


            }

        }
        System.out.println(result);


    }


}

/*

	2. FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5

 */
