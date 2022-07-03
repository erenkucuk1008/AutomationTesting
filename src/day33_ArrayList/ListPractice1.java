package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i=0; i<=100; i++){
            if (i%2==0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

        System.out.println("Last odd number: "+odd.get(odd.size()-1));

        System.out.println("==========================================");

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {11,22,44};
        int[] arr4 = {32,42,52,62};
        int[] arr5 = {111,222,333,444,555};

        int[][] arr2D = {arr1,arr2,arr3,arr4,arr5};

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int[] eachArr : arr2D){
            for (int each : eachArr){
                arrList.add(each);
            }
        }
        System.out.println(arrList);
    }
}
