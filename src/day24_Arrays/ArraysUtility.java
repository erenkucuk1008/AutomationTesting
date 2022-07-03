package day24_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        String s = Arrays.toString(arr);
        System.out.println(s);

        String[] names = {"Muhtar","Saim","Nadir","Asiya","Kuzat"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));

        System.out.println("===========================");

        int[] nums = {5,4,6,4,3,10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // kucukten buyuge siralar
        System.out.println(Arrays.toString(nums));

        System.out.println("Max number is: "+nums[nums.length-1]);
        System.out.println("Min number is: "+nums[0]);

        System.out.println("===========================");

        String[] students = {"Mehdi","Elkeem","Mee","Trump"};
        Arrays.sort(students); // Elkeem Mee Mehdi Trump   -------- alfabetik sirayla yazar
        System.out.println(Arrays.toString(students));

        System.out.println("============================");

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1); // true

        int[] arr3 = {2,1,3};
        //Arrays.sort(arr3); true olurdu

        boolean r2= Arrays.equals(arr1,arr3);
        System.out.println(r2); // false

    }
}
