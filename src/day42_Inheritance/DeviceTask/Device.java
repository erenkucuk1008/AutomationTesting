package day42_Inheritance.DeviceTask;

public class Device {

    public String deviceName, brand, model;
    public double price;
    public static String madeIn;
    public static boolean hasBattery, hasPowerButton;

    static {
        madeIn = "China";
        hasBattery = true;
        hasPowerButton = true;
    }

    public void setInfo(String deviceName, String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.deviceName = deviceName;
    }

    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }

    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price +
                ", made in=" + madeIn +
                ", has battery=" + hasBattery +
                ", has power button=" + hasPowerButton +
                '}';
    }
}
