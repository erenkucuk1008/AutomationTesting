package day29_CustomMethods;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr = {2,4,5,7,9};
        addELements(arr,45);
    }

    public static void addELements(int[] arr, int num){

        int[] arrNew = new int[arr.length+1];

        for (int i=0; i<= arr.length-1; i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length-1]  = num;
        System.out.println(Arrays.toString(arrNew));
    }
}
