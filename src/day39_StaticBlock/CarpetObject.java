package day39_StaticBlock;

import java.util.ArrayList;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet c1 = new Carpet();
        Carpet c2 = new Carpet();
        Carpet c3 = new Carpet();
        Carpet c4 = new Carpet();
        Carpet c5 = new Carpet();


        c1.customInfo(2,3,85,true);
        c2.customInfo(4,5.5,42,false);
        c3.customInfo(5,3,80,true);
        c4.customInfo(4,4.5,37,false);
        c5.customInfo(8,9,102,true);

        Carpet[] carpets = {c1,c2,c3,c4,c5};

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        System.out.println("The list of Persian Carpets"); // arrayden tek tek arrayliste eklemek
        for (Carpet each : carpets){
            if (each.isPersian){
                persianCarpets.add(each);
                System.out.println(each);
            }
        }

        System.out.println("The list of Regular Carpets");
        for (Carpet each : carpets){
            if (!each.isPersian){
                regularCarpets.add(each);
                System.out.println(each);
            }
        }

        /*
        ArrayList<Carpet> pers = new ArrayList<>(Arrays.asList(carpets)); // 2.Yontem
        pers.removeIf(p-> !p.isPersian);

        for (Carpet each : pers){
            System.out.println(each);
        }

         */
    }
}
