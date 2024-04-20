package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {


        String word = "";
        boolean r1 = word.isEmpty(); // if the length equals to zero

        System.out.println(r1);

        //--

        // returns true as long as there are no char in the String, as long as it has blank white spaces

        String str = "           ";
        boolean r2 = str.isEmpty(); // false
        boolean r3 = str.isBlank(); // true
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        //equals() compares one string to another. as long as they have same char. it cannot ignore cases.
        // == don't use this to compare two strings, use equals method.

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3)); // false

        // equalsIgnoreCase() if two String has same char case insensitive

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // contains() pass string verify if this String is included.

        String students = "Hasan Naran Sumeye Nataliia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);

        // startsWith() if string starts with certain char. endsWith() checking if it ends with certain char.
        
        String name = "Michael";
        boolean startsWithDa = name.startsWith("Da");
        System.out.println("startsWithDa = " + startsWithDa);
        
        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println("isValid = " + isValid);
        boolean t = url.endsWith(".com");
        System.out.println("t = " + t);

        // --------------------------------------------------------

        String email = "CydeoSchool@outlook.com";
        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);


        String m = "abc";
        String n = "abc";

        System.out.println("m == n" + m == n); // m==nabc == n

        System.out.println(m == n);

        String ta = "A";
        ta += "B";
        String tb = "C";
        ta += tb;
        System.out.println("ta = " + ta);
        ta.replace('C', 'D'); // it replaces C with D but it doesnt reassign to ta hence below ta result is ABC not ABD
        System.out.println(ta);












    }
}
