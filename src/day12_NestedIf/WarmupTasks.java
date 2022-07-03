package day12_NestedIf;

public class WarmupTasks {

    public static void main(String[] args) {

        int n1 = 43;
        int n2 = 13;
        int n3 = 23;

        boolean n1Equaln2 = n1 == n2 ; // && n1 != n3; bunlari da eklersek oncelikli kod yazmamiz gerekmez
        boolean n1Equaln3 = n1 == n3 ; // && n1 != n2;
        boolean n2Equaln3 = n2 == n3 ; // && n1 != n2
        boolean allEqual = n1 == n2 && n2 == n3;;
        //boolean nonEqual = !n1Equaln2 && !n1Equaln3 && !n2Equaln3;

        if (allEqual){                          // ilk once hepsinin esit oldugunu yaziyoruz
            System.out.println("All equal");    // cunku, kod yukaridan asagi okunur.
        }else if (n1Equaln3){                   // en alta yazsaydik, hepsinin esit oldugu durumda
            System.out.println(n1+ " is equal to "+n3); // once ust kodu yazacagindan dolayi
        }else if (n2Equaln3){                          // n1 ve n3 esit diye okunur.
            System.out.println(n2+" is equal to "+n3);
        }else if (n1Equaln2){
            System.out.println(n1+" is equal to "+n2);
        }else {
            System.out.println("None of them are equal");
        }

        String result = allEqual ? "All equal" : n1Equaln3 ? "n1&n3 are equal" :
                n2Equaln3 ? "n2&n3 are equal" : n1Equaln2 ? "n1&n2 are equal" : "None of them are equal";

        System.out.println(result);


    }
}
