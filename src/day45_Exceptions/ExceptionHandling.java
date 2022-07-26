package day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        //StringIndexOutOfBoundsException

        String name = "Eren";

        try{
            System.out.println(name.substring(200,300));
            System.out.println("Try Block");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Catch Block");
            //System.out.println( e.getMessage() ); // hata msjini aliriz
            //e.printStackTrace(); // hatayi komple gormemizi saglar.
        }


        //Thread.sleep();

        try {
            Thread.sleep(5000);
            //System.out.println("Try Block");
        }catch (InterruptedException e){
            //System.out.println("Catch Block");
        }

        try{
            System.out.println(100/0);
        }catch (RuntimeException e){
            System.out.println("Unchecked exception is occurred: "+ e.getMessage());
        }

        System.out.println("Test Complete");
    }
}
