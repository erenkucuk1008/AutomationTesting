package day45_Exceptions.PhoneTask;

public class Samsung extends Phone{

    public Samsung(String model, double price) {
        super("Samsung", model, "South Korea", price);
    }

    //freeze()
    public void freeze(){
        System.out.println(brand+" "+model+" is freezing...");
    }
}
