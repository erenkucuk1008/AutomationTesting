package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25/0);
        }catch (NoSuchElementException e) {
            System.out.println("No Such Element exception");
        }catch (ClassCastException e){
            System.out.println("Class Cast exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer exception");
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
        }

        System.out.println("=======================================");

        String[] names = {"Walid","Muihtar","Ayjeren"};

        try{
            names[10] = "Eren";
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exception");
        }catch (NoSuchElementException e){
            System.out.println("No Such Element exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bound exception");
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
        }catch (Exception e){
            System.out.println("Exception");
        }
        //parent exception altta yazilmak zorunda!!!
        // ArrayIndex ve StringIndex child
        //IndexOutOf parent oldugu icin IndexOut onlardan alta yazilmali
        //Genel siralama da oyle olmak zorunda..!!!!
    }
}
