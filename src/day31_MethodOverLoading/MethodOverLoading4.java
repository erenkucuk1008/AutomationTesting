package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoading4 {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,2,4,9,55,32};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("==============================");

        double[] arr1 = {3.3, 6.4, 7.7, 8, 0.5, 1.2};
        System.out.println(Arrays.toString(sort(arr1)));

        char[] arr2 = {'a','f','z','x','e'};
        System.out.println(Arrays.toString(sort(arr2)));
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

}
