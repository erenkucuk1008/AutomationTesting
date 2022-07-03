package day32_LocalDate_WrapperClass;

import library.ArraysUtility;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int num = 6;
        System.out.println(Arrays.toString(addElements(arr1,num)));

        System.out.println("==============================");

        String[] str1 = {"Eren","Arzum"};
        String str2 = "EAK";
        System.out.println(Arrays.toString(addElements(str1,str2)));

    }
//                                 {1,2,3,4,5}     6
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
