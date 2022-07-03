package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods_3 {

    public static void main(String[] args) {

        int[] arr1 = {11,2,6,7,4,23,9};
        int max = max(arr1);
        System.out.println(max);
        int max2 = max2(arr1);
        System.out.println(max2);
        int min=min(arr1);
        System.out.println(min);
        int min2 = min2(arr1);
        System.out.println(min2);
    }

    public static int max(int[] arr){

        int max=arr[0];

        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int min(int[]arr){
        int min = arr[0];
        for (int each:arr){
            if (each<min){
                min=each;
            }
        }
        return min;
    }

    public static int min2(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
