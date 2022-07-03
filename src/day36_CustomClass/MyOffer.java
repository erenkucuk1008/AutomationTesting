package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {

    public static void main(String[] args) {

        String localArea = "Hawaii";

        Offer[] myOffers = {
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
        };

        myOffers[0].setInfo("CA","QA",120000,true,true,true,true);
        myOffers[1].setInfo("NY","SDET",145000,true,false,true,true);
        myOffers[2].setInfo("CA","PO",90000,false,true,false,false);
        myOffers[3].setInfo("VA","SDET",105000,true,true,false,false);
        myOffers[4].setInfo("FL","BA",80000,true,true,true,true);
        myOffers[5].setInfo("CA","QA",95000,true,true,true,true);
        myOffers[6].setInfo("HI","SM",75000,true,true,true,false);

        ArrayList<Offer> offerList = new ArrayList<>();
        offerList.addAll(Arrays.asList(myOffers));
        /*
        MyOffers:
            create 7 objects of Offer class and store them into an ArrayList of Offer
            write a program that can only keep the offers from local area
            write a program that can remove all offers that are not for SDET or QA
            write a program that can remove all offers that are not work from home
            write a program that can remove all offers that does not have benefits
            write a program that can remove the offers that are not full Time

        offerList.removeIf(p-> !(p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("QA")));
        offerList.removeIf(p-> p.WFH==false);
        offerList.removeIf(p-> p.hasBenefit==false);
        offerList.removeIf(p-> p.isFullTime==false);

        for (Offer each : offerList){
            each.getInfo();
        }
 */
        /*
        print only location from CA and Salary is higher than $100.000
         */
        for (Offer each : offerList){
            if (each.location.equalsIgnoreCase("CA") && each.salary>100000){
                each.getInfo();
            }
        }

        System.out.println("===============================================");
        
        ArrayList<Offer> SDET = new ArrayList<>(offerList);// arraylist i direk yazabiliriz parantez icine. O listeyi yeni listemize eklemis oluyoruz
        SDET.removeIf(p-> !(p.jobTitle.equalsIgnoreCase("SDET")));

        System.out.println("SDET Offers: "+ SDET.size());
    }
}
