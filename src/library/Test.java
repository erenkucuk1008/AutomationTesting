package library;

import day41_Encapsulation.Data;

import static day41_Encapsulation.Data.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(publicVariable);
        //System.out.println(defaultVariable);
        //out of package, we can not call variable as default

        //Data d1 = new Data(); //  we can not call variable as default

        Data.publicMethod();
    }
}
