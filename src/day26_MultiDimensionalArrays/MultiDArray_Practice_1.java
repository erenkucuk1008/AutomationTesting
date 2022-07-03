package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDArray_Practice_1 {

    public static void main(String[] args) {

        String[] testers = {"Eren","Arzum"};
        String[] developers = {"Mike","Tylor","Mark"};
        String[] SM = {"Suleyman"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Hakan","Omer"};

        String[][] scrumTeam = {testers,developers,SM,PO,BA};
//                                 0       1        2  3  4
        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Bizdik";
        scrumTeam[0] = testers2;

        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("======================================");

        for (String[] each : scrumTeam){
            System.out.println(Arrays.deepToString(scrumTeam));
        }

        for (String[] each : scrumTeam){
            for (String name : each){
                System.out.println(name);
            }
        }

        System.out.println("======================================");

        int[][] numbers = {{10,20,30,45},{60,55,75,7,105},{93,48,125,135}};

        for (int[] each : numbers){
            for (int num : each){
                if (num%3==0 || num%5==0){
                    System.out.print(num+" ");
                }
            }
        }

        System.out.println("====================");

        int[][] num1 = {{1,2},{3,4}};
        int[][] num2 = {{55,66},{7,78,9,8,98}};

        int[][][] number3 = {     {{1,2},{3,4}},   {{55,66},{7,78,9,8,98}}   };

        System.out.println(Arrays.deepToString(number3));
    }
}
