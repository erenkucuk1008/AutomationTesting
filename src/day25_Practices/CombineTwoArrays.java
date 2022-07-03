package day25_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,55,32,1234,7645};
        int[] arr2 = {4,5,-234,643466};

        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size];

        int index = 0;

        for (int each:arr1){
            arr3[index++] = each;
            //index++;
        }
        for (int each : arr2){
            arr3[index++] = each;
            //index++;
        }

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

        System.out.println("Max number is: "+arr3[arr3.length-1]);
    }
}
