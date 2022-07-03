package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {

        positiveOrNegative(45);
        positiveOrNegative(-23);
        positiveOrNegative(0);

        System.out.println();

        int [] arr = {1,2,4,0,-4,-99};
        for (int each:arr){
            positiveOrNegative(each);
        }

        int[] arr1 = {1,2,3};
        int[] arr2 = {44,55,22};
        combineTwoArrays(arr1,arr2);

        String str = "erenne";
        removeDuplicates(str);
    }

    public static void positiveOrNegative(int num){

        if (num>0){
            System.out.println(num+" is positive");
        }else if (num<0){
            System.out.println(num+" is negative");
        }else {
            System.out.println("Zero");
        }
    }

    public static void combineTwoArrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+ arr2.length];

        int i=0;

        for (int each : arr1){
            arr3[i++] = each;
        }
        for (int each1:arr2){
            arr3[i++] = each1;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void removeDuplicates(String word){

        String result ="";
        for (String each : word.split("")){
            if (!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
