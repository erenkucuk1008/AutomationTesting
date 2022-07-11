package day42_Inheritance.DeviceTask;

public class DeviceObject {

    public static void main(String[] args) {

        TV tv = new TV("Sony","UV690",699.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();
        System.out.println(TV.hasBattery);
        // static variable cagirirken Class ismini kullanmamiz lazim. "TV" oluyor, not tv

        Phone phone = new Phone("Apple","Iphone 12 Pro",999.99);
        System.out.println(phone);
        phone.call(1234531234);
        phone.text(4567839);
        phone.turnOn();
        System.out.println(Phone.canCall); // Phone, not phone
        System.out.println(Phone.canSendMessage); // class ismi, obj ismi degil
    }
}
