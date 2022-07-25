package day45_Exceptions.PhoneTask;

public class Iphone extends Phone{

    public Iphone(String model, double price) {
        super("Iphone", model, "USA", price);
    }

    public void facetime(long number){
        System.out.println(brand+" "+model+" is face timing with "+number);
    }

    public void facetime(String email){
        System.out.println(brand+" "+model+" is face timing with "+email);
    }

    public void facetime(long number1, long number2){
        facetime(number1);
        facetime(number2);
    }

    public void facetime(String email1, String email2){
        facetime(email1);
        facetime(email2);
    }

    public void facetime(long number1, long number2, long number3){
        facetime(number1,number2);
        facetime(number3);
    }

    public void facetime(String email1, String email2, String email3){
        facetime(email1, email2);
        facetime(email3);
    }
}
