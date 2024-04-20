package day08_ternary_switch;

public class SwitchMonths {

    public static void main(String[] args) {

        int number = 14;
        String month = "";

        switch (number){
            case 1:
                month = "Jan";
                break;
            case 2:
                month = "Jan";
                break;
            case 3:
                month = "Jan";
                break;
            case 4:
                month = "Jan";
                break;
            case 5:
                month = "Jan";
                break;
            case 6:
                month = "Jan";
                break;
            case 7:
                month = "Jan";
                break;
            case 8:
                month = "Jan";
                break;
            case 9:
                month = "Jan";
                break;
            case 10:
                month = "Jan";
                break;
            case 11:
                month = "Jan";
                break;
            case 12:
                month = "Dec";
                break;
            default:
                month = "invalid";

        }
        System.out.println(month);

        float num = 1234f;
        System.out.println(num);

        int x = 12;

        System.out.println(x++ + +x); // 12 + 13 // operatore gelince deger degisiyor

        String var1 = "test";
        String var2 = "test2";

        System.out.println(var1.equals(var1));



    }
}
