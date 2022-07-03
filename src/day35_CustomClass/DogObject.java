package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.setInfo("Tima","York","small",
                'M',"Black", LocalDate.of(2020,11,25));
        dog1.getInfo();

        dog2.setInfo("Balli","Maltese","small"
                ,'F',"White",LocalDate.of(2012,2,2));
        dog2.getInfo();

        dog3.setInfo("Richard","Chow Chow","Medium",
                'M',"Brown",LocalDate.of(2006,4,12));
        dog3.getInfo();

        dog1.eat("Chicken");
        dog2.drink("Water");

        dog4.setInfo("Misha","husky","big",
                'M',"Chocalate",LocalDate.of(2016,5,15));
        dog4.getInfo();

        Dog[] dogs = {dog1,dog2,dog3,dog4};

        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> maltese = new ArrayList<>();

        for (Dog eachDog: dogs){
            if (eachDog.breed.equalsIgnoreCase("husky")){
                huskies.add(eachDog);
            }else if (eachDog.breed.equalsIgnoreCase("maltese")){
                maltese.add(eachDog);
            }
        }

        System.out.println("Total number of Huskies: "+huskies.size());
        System.out.println("Total number of Maltese: "+maltese.size());

    }
}
