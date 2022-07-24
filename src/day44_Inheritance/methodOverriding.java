package day44_Inheritance;

class A{

    public void method(){

    }
}
    /*
    same method name, same parameter, same return-type(MUST)
    MUST happen in sub class
    @Override MUST ve applicable (for checking)
    Access modifier MUST be same or more visible
    only instance method can be override ( can not be final or private )

    Visibility:
    public > protected > default > private
    */
public class methodOverriding extends A {

    @Override
    public void method(){

    }

    @Override
    public String toString() {
        return "example";
    }
}
