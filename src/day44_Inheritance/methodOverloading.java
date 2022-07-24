package day44_Inheritance;

public class methodOverloading {

    /*
    same method name, different parameter
    access modifier does not matter
    return-type does not matter
    any method can be overload
     */

    public void method(int a){

    }

    private void method(double b){

    }

    protected long method(long c){
        return 10;
    }
}
