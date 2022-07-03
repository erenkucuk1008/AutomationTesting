package day35_CustomClass;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Nissan";// first copy
        car2.brand = "BMW";// second copy
        car3.brand = "Jeep";// third copy

        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);

        car1.model = "Versa";
        car2.model = "M5";
        car3.model = "Wrangler";

        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);

        Car car4 = new Car();
        car4.setInfo("Mercedes","A220","White",2021,28990);
        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.year);
        System.out.println(car4.price);

        //2021 Mercedes A220 White
        System.out.println(car4.year+" "+car4.brand+" "+car4.model+" "+car4.color);
    }
}
