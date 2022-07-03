package day24_Arrays;

import java.util.Arrays;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};

        for (int i=0; i<= arr.length-1; i++){
            int frequency = 0;
            for (int j=0; j<= arr.length-1; j++){
                if(arr[i]==arr[j]){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
