package day46_JavaRecap.CarTask;

public class CarMax {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("G 63", "Red", 2022,138000);
        Lexus lexus =  new Lexus("RX 350", "White", 2018, 20000);
        BMW bmw = new BMW("X6", "Black", 2019, 45000);
        Tesla tesla = new Tesla("Model 3", "Blue", 2020, 50000);


        System.out.println(mercedes);
        // mercedes.autoPark();
        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("=======================");
        mercedes.drive();
        bmw.drive();
        lexus.drive();
        tesla.drive();

        System.out.println("===========================");
        //mercedes.autoPark();
        bmw.autoPark();

        tesla.autoPilot();
    }
}
