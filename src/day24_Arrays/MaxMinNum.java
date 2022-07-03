package day24_Arrays;

import java.util.Scanner;

public class MaxMinNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}
