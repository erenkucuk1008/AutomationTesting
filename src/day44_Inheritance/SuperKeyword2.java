package day44_Inheritance;

class B{

    public B(){
        System.out.println("Super Class' default constructor");
    }
}

public class SuperKeyword2 extends B {

    public SuperKeyword2(){
        //super(); // call the super class constructor
        System.out.println("SubClass' default constructor");
    }

    public static void main(String[] args) {

        new SuperKeyword2();
    }

}
