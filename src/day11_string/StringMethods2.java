package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);

        System.out.println("---");

        String word = "Java";

//        word = word.replace('a', 'e');
        System.out.println(word);
        word = word.replace("a", "e");
        System.out.println(word);

        System.out.println("=---");

        String sentence2 = "I love Java, Java is cool";
        //sentence2 = sentence2.replace("Java", "Python");
        System.out.println(sentence2);

        sentence2 = sentence2.replaceFirst("Java", "Phyton");
        System.out.println(sentence2);

        System.out.println("=---");

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        // sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);

        System.out.println("---");

        String sentence4 = "I love Java Programming";

        System.out.println(sentence4.indexOf("J"));
        String languageName = sentence4.substring(7, 10+1);
        System.out.println(languageName);

        System.out.println("----");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        System.out.println(sentence5.indexOf("S"));
        sentence5 = sentence5.substring(9, 14+1);
        System.out.println(sentence5);

        System.out.println("-----");

        String email = "CydeoSchoolJavaProgramming@yahoo.com";
//      System.out.println(email.indexOf("@"));
//      email = email.substring(27, 31+1);
//      System.out.println(email);

        int beginning = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);
        System.out.println("-----");

        String sentence6 = "I love Java programming";
//        int beginning1 = sentence6.indexOf('J');
//        System.out.println(beginning1);
//        sentence6 = sentence6.substring(beginning1);
//        System.out.println(sentence6);

        // String r1 = sentence6.substring(7, sentence6.length());
        String r1 = sentence6.substring(7); // this will start from index 7 to end of the string

        System.out.println(r1);

        System.out.println("----");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') +1);
        System.out.println(tomorrow);
        // System.out.println(sentence7.substring(sentence7.indexOf("M")));
        //        int indexM = sentence7.indexOf("M");
//        System.out.println(indexM);
//        String substringM = sentence7.substring(indexM);
//        System.out.println(substringM);

        System.out.println("----");

        String sentence8 = "I study at Cydeo School";
        String substringC = sentence8.substring(sentence8.indexOf('C'));
        System.out.println(substringC);

        System.out.println("---");

        String str = "Python";
        String result = (str + "\n").repeat(10); // first do the concat and then repeat method
        System.out.println(result);
















    }
}
