package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C";
    protected static String protectedVariable = "D";

    Data(){

    }

    public static void publicMethod(){
        System.out.println("Public method");
    }

    private static void privateMethod(){
        System.out.println("Private method");
    }

    static void defaultMethod(){
        System.out.println("Default method");
    }
}
