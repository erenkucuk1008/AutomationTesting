package day22_NestedLoops;

public class NestedLoop_2 {

    public static void main(String[] args) {

        int j=1;
        while (j<=10){

            for (int i=1; i<=5; i++){
                System.out.print("*");
            }
            System.out.println();

            j++;
        }
    }
}
