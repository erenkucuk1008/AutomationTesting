package day31_MethodOverLoading;

import library.ArraysUtility;

import java.util.Arrays;

public class MethodOverLoading5 {

    public static void main(String[] args) {

        double[] arr1 = {41.5, 2.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5};
        double[] arr3 = {11.5, 12.5, 13.5};
        double[] arr4 = {21.5, 22.5, 23.5};

        double[] arr5 = combineTwoArrays(combineTwoArrays(arr1,arr2),combineTwoArrays(arr3,arr4));
        System.out.println(Arrays.toString(arr5));

        System.out.println("=========================");

        int[] a1 = {1,2,77};
        int[] a2 = {44,3,12};
        int[] a3 = {65,23,7,8,9};

        int[] a4 = combineTwoArrays(combineTwoArrays(a1,a2),a3);
        System.out.println(Arrays.toString(a4));

        System.out.println("=========================");

        String[] str1 = {"Eren","Arzum"};
        String[] str2 = {"Suleyman","Mehmet"};
        String[] str3 = {"Hakan","Suleyman","Jeep","Wrangler"};
        String[] str4 = {"Gurman","Betul","Mkb"};
        String[] str5 = {"Hawaii","USA","Turkey"};
        String[] combined1V2 = combineTwoArrays(str1,str2);
        String[] combined3V4 = combineTwoArrays(str3,str4);

        String[] combinedAll = combineTwoArrays(combineTwoArrays(combined1V2,combined3V4),str5);
        System.out.println(Arrays.toString(combinedAll));
    }

    public static int[] combineTwoArrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+ arr2.length];

        int i=0;

        for (int each : arr1){
            arr3[i++] = each;
        }
        for (int each1:arr2){
            arr3[i++] = each1;
        }
        return arr3;
    }

    public static double[] combineTwoArrays(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length+ arr2.length];

        int i=0;

        for (double each : arr1){
            arr3[i++] = each;
        }
        for (double each1:arr2){
            arr3[i++] = each1;
        }
        return arr3;
    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length+ arr2.length];

        int i=0;

        for (String each : arr1){
            arr3[i++] = each;
        }
        for (String each1:arr2){
            arr3[i++] = each1;
        }
        return arr3;
    }
}
