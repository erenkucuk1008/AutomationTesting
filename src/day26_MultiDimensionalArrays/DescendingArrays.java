package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class DescendingArrays {

    public static void main(String[] args) {

        int[] numbers = {1,33,5,7,9,11};

        int[] descending = new int[numbers.length];

        Arrays.sort(numbers);

        /*
        descending[0] = numbers[5];
        descending[1] = numbers[4];
        descending[2] = numbers[3];
        descending[3] = numbers[2];
        descending[4] = numbers[1];
        descending[5] = numbers[0];

         */

        int k = numbers.length-1;
        for (int i = 0; i<=numbers.length-1; i++){
            descending[i] = numbers[k];
            k--;
        }
        System.out.println(Arrays.toString(descending));
    }
}
