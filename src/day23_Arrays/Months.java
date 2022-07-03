package day23_Arrays;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int num = scan.nextInt();

        System.out.println(months[num-1]); // index 0 dan basladigi icin -1 yapiyoruz.
        //                                    -1 yapmasak 5 yazdigimizda Jun cikar.
    }
}
