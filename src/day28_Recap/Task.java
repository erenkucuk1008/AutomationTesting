package day28_Recap;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i=arr2D.length-1; i>=0; i--) {
            int[] each1DArray = arr2D[i];
            for (int j=0; j<= each1DArray.length-1; j++) {
                int eachArray = each1DArray[j];
                System.out.print(eachArray + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");

        for (int i=0; i<=arr2D.length-1; i++) {
            int[] each1DArray = arr2D[i];
            for (int j= each1DArray.length-1; j>=0; j--){
                int eachArray = each1DArray[j];
                System.out.print(eachArray+" ");
            }
            System.out.println();
        }
        System.out.println("==================================");

        for (int i=arr2D.length-1; i>=0; i--) {
            int[] each1DArray = arr2D[i];
            for (int j= each1DArray.length-1; j>=0; j--) {
                int eachArray = each1DArray[j];
                System.out.print(eachArray + " ");
            }
            System.out.println();
        }
    }
}
