package day40_Constructor;

public class ConstructorCall {

    public ConstructorCall() {
        System.out.println("Default Constructor");
    }

    public ConstructorCall(int a){
        this();
        System.out.println("Constructor with int value");
    }

    public ConstructorCall(String str){
        this(10);
        System.out.println("Constructor with String value");
    }

    public static void main(String[] args) {
        ConstructorCall c1 = new ConstructorCall("Aga");
    }
}


