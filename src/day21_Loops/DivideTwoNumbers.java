package day21_Loops;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a=15;
        int b=2;
        int count=0;

        if (b==0){
            System.out.println("Invalid Input");
            System.exit(0);
        }

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println("Mod is: "+a);
        System.out.println("Divide is: "+count);
    }
}
