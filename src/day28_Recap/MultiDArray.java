package day28_Recap;

import java.util.Arrays;

public class MultiDArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        System.out.println(Arrays.toString(arr2D[1])); // [4 5 6 7 8]
        System.out.println(Arrays.deepToString(arr2D));// [ [1 2 3 4] [5 6 7 8] [9 10 11 12 13] ]
        System.out.println(arr2D[1][3]); // 7

        System.out.println("=====================================");

        for (int i=0; i<=arr2D.length-1; i++){
            int[] each1DArray = arr2D[i];
            //System.out.println(Arrays.toString(each1DArray));

            for (int j=0; j<= each1DArray.length-1; j++){
                int eachArray = each1DArray[j];
                System.out.print(eachArray+" "); // 1 2 3 4 5 6 7 8 9 10 11 12 13
            }
            System.out.println();

        }

        System.out.println("=================================================");

        for (int[] each1DArr : arr2D){
            for (int eachElement : each1DArr){
                if (eachElement %2 != 0 ){
                    System.out.print(eachElement+" ");// multi array de tek sayilari bulur
                }
            }
            System.out.println();
        }
    }
}
