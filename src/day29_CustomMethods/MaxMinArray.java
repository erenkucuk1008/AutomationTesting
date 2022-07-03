package day29_CustomMethods;

import java.util.Arrays;

public class MaxMinArray {

    public static void main(String[] args) {

        int[] arr1 = {100,-200,32,-200,444,500,444,62,500,8,71,8};
        maxNum(arr1);
        //arrayMaxNum(arr1);
        minNum(arr1);
        uniqueArr(arr1);

    }

    public static void maxNum(int[] arr){
        
        int max = arr[0];
        for (int each : arr){
            if (each>max){
                max = each;
            }
        }
        System.out.println(max);
    }

    // Formulsuz Arrays.sort ile siralayarak max num bulmak
    public static void arrayMaxNum(int[] arr){
        Arrays.sort(arr);
        System.out.println("Max number is: "+arr[arr.length-1]);
        System.out.println("Min number is: "+arr[0]);
    }

    public static void minNum(int[] arr){

        int min= arr[0];
        for (int each:arr){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);
    }

    public static void uniqueArr(int[] arr){

        for (int each:arr){
            int count = 0;
            for (int each2:arr){
                if (each==each2){
                    count++;
                }
            }
            if (count==1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }
}
