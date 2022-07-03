package library;

import java.util.Arrays;

public class ArraysUtility {

    public static int max(int[] arr){

        int max=arr[0];

        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static double max(double[] arr){

        double max=arr[0];

        for (double each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
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

    public static double min(double[]arr){
        double min = arr[0];
        for (double each:arr){
            if (each<min){
                min=each;
            }
        }
        return min;
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

    public static char[] combineTwoArrays(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length+ arr2.length];

        int i=0;

        for (char each : arr1){
            arr3[i++] = each;
        }
        for (char each1:arr2){
            arr3[i++] = each1;
        }
        return arr3;
    }

    public static int[] sort(int[]arr){ //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        int[] reversedArr = new int[arr.length];

        for (int i= arr.length-1, j=0; i>=0; i--, j++){
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

    public static double[] sort(double[]arr){ //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        double[] reversedArr = new double[arr.length];

        for (int i= arr.length-1, j=0; i>=0; i--, j++){
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

    public static char[] sort(char[]arr){ //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        char[] reversedArr = new char[arr.length];

        for (int i= arr.length-1, j=0; i>=0; i--, j++){
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

    public static String[] sort(String[]arr){ //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        String[] reversedArr = new String[arr.length];

        for (int i= arr.length-1, j=0; i>=0; i--, j++){
            reversedArr[j] = arr[i];
        }
        return reversedArr;
    }

    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str = str.replace("[","{").replace("]","}");
        return str;
    }

    public static int[] addElements(int[] arr, int num){

        int[] result = new int[arr.length+1];

        for (int i=0; i<= arr.length-1; i++){
            result[i] = arr[i];
        }
        result[result.length-1] = num;

        return result;

    }

    public static double[] addElements(double[] arr, double num){

        double[] result = new double[arr.length+1];

        for (int i=0; i<= arr.length-1; i++){
            result[i] = arr[i];
        }
        result[result.length-1] = num;

        return result;
    }

    public static String[] addElements(String[] arr, String str){

        String[] result = new String[arr.length+1];

        for (int i=0; i<= arr.length-1; i++){
            result[i] = arr[i];
        }
        result[result.length-1] = str;

        return result;
    }

    public static char[] addElements(char[] arr, char ch){

        char[] result = new char[arr.length+1];

        for (int i=0; i<= arr.length-1; i++){
            result[i] = arr[i];
        }
        result[result.length-1] = ch;

        return result;
    }
}
