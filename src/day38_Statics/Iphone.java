package day38_Statics;

public class Iphone {

    public String model, color;
    public int price, storage;

    public static String brand = "Apple", OS = "IOS", madeIn = "China";

    public void call(long phoneNumber){
        System.out.println("Iphone "+model+" is calling "+phoneNumber);
    }

    public static void getInfo(){                 // static metot da static variables olmak zorunda
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+ OS);
        System.out.println("Maden in: "+ madeIn);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand=" + brand +
                ", model=" + model +
                ", color=" + color +
                ", price=" + price +
                ", storage=" + storage +
                ", operating system=" + OS +
                '}';
    }
}
