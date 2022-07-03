package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiD_Arrays {

    public static void main(String[] args) {

        char[] ch1 = {'A','B'};
        char[] ch2 = {'G','K','L'};
        char[] ch3 = {'R','Q','W','Z'};

//                         0   1      0   1   2      0   1   2   3
        char[][] ch2D = {{'C','E'}, {'G','K','A'}, {'R','Q','W','K'}};
//                           0             1                2

        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(ch2D[2][2]);

        System.out.println(ch2D[0][1]+" "+ch2D[1][2]+" "+ch2D[2][3]);

        System.out.println(ch2D[2][1]+"       "+ch2D[0][1]);

        System.out.println("==========================================");

        int [][] nums = {{1,2,3},{44,34,24},{11,21,45},{9,7,6}};

        for (int i=0; i<= nums.length-1; i++){
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
