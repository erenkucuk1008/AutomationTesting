package day41_Encapsulation;

import static day41_Encapsulation.Data.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(publicVariable);
        //System.out.println(privateVariable);
        System.out.println(defaultVariable);
        System.out.println(protectedVariable);

        Data d1 = new Data();

        Data.publicMethod();
        Data.defaultMethod();
        //Data.privateMethod();


    }
}
