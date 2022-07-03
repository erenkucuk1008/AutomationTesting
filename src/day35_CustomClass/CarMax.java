package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Jeep","Wrangler","White",2021,43950);
        //car1.getInfo();

        car2.setInfo("Nissan","Versa","Grey",2008,3200);
        car3.setInfo("Honda","Civic","Red",2023,25500);
        car4.setInfo("Ford","Focus","Black",2012,5750);
        car5.setInfo("BMW","M5","Blue",2021,48500);


        Car[] cars = {car1,car2,car3,car4,car5};
        for (Car eachCar : cars){
            eachCar.getInfo();
        }

        System.out.println("========================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));
        carList.removeIf(p-> p.price<24999);

        for (int i=0; i<carList.size(); i++){
            carList.get(i).getInfo();
        }


    }
}
