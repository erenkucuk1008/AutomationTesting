package day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String name = "Eren";

        try{
            System.out.println(name.substring(200,300));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException is occurred");
        }

        System.out.println("Test Complete");


    }
}
