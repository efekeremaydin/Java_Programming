package day27_accessModifiers;

public class AccessModifiers {

    public static int publicDate = 200;
    // same class, package or outside the package, it's accessible


    protected static int protectedDate = 300;
    // same class and package = accessible. outside the package = not always

//    default static int defaultData;  // default is for methods not for acc mod.

    static int defaultData = 400; // this is with def. mod., you DO NOT NEED DEFAULT KEYWORD
    // same class and package visible. NEVER visible within subclass or outside the package.

    private static int privateData = 500;

    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }





    public static void main(String[] args) {

        System.out.println(publicDate); // inside the main class i can access this static var

        System.out.println(protectedDate); // accessible within the same class

        System.out.println(defaultData); // accessible within the same class

        System.out.println(privateData); // accessible within the same class

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();



    }














}
