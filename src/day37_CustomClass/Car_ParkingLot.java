package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Car_ParkingLot {

    public static void main(String[] args) {

        Car[] cars = {new Car(),new Car(),new Car(),new Car(),new Car()};

        cars[0].setInfo("BMW","i85","Black", LocalDate.of(2022,5,11),55000,12000);
        cars[1].setInfo("BMW","i8","White", LocalDate.of(2011,1,1),47900,17300);
        cars[2].setInfo("BMW","330i","Blue", LocalDate.of(2010,2,21),38200,22000);
        cars[3].setInfo("BMW","X5","Gray", LocalDate.of(2023,9,12),65000,2000);
        cars[4].setInfo("BMW","X3","Red", LocalDate.of(2021,12,14),48000,18330);


        //recall All BMW that were build before 2017

        ArrayList<Car> recall1 = new ArrayList<>();
        for (Car each: cars){
            if (each.brand.equals("BMW") && each.year<2017){               //  ARRAY DEN ILERLIYORUZ
                recall1.add(each);
            }
        }
        System.out.println(recall1);

        System.out.println("=================================================");
        //print only I8 that built before 2015

        ArrayList<Car> recall2 = new ArrayList<>(Arrays.asList(cars));   //ARRAYLISTEN ILERLYORUZ
        recall2.removeIf(p-> !(p.model.equals("i8") && p.year<2016));   // COLLECTION KULLANMAK ICIN
        System.out.println(recall2);                                // IKISIDE YAPILABILIR.FARKLI YOL
    }
}
