package day42_Inheritance.DeviceTask;

public class TV extends Device{

    public static boolean hasChannel, hasCabel;

    static {
        hasChannel = true;
        hasCabel = true;
    }

    public TV(String brand, String model, double price){
        setInfo("TV",brand, model, price);
    }

    public void channelUp(){
        System.out.println("Channel up "+ brand + " " + model);
    }

    public void channelDown(){
        System.out.println("Channel down "+ brand + " " + model);
    }

    @Override
    public String toString() {
        return "TV{" +
                "device name=" + deviceName +
                ", brand=" + brand +
                ", model=" + model +
                ", price= $" + price +
                '}';
    }
}
