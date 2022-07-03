package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {

        String[] countries = {"Turkey","Switzerland","Australia","United States Of America"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p-> p.length()>10);
        System.out.println(list);

        System.out.println("======================================");

        LocalDate[] arr1 = {
                LocalDate.of(2022,6,26),
                LocalDate.of(2021,6,26),
                LocalDate.of(2020,6,26),
                LocalDate.of(2019,6,26),
                LocalDate.of(2018,6,26),
                LocalDate.of(2017,6,26)
        };
        LocalDate d1 = LocalDate.of(2019,8,15);
        ArrayList<LocalDate> date = new ArrayList<>(Arrays.asList(arr1));
        date.removeIf(p-> p.isBefore(d1));
        System.out.println(date);

        System.out.println("======================================");

        String[] jobTitle = {"SDET","Developer","Software","QA","SDET"};
        ArrayList<String> listOfTitle = new ArrayList<>(Arrays.asList(jobTitle));
        listOfTitle.retainAll(Arrays.asList("SDET","QA"));
        //listOfTitle.removeIf(p-> !(p.equals("SDET") || p.equals("QA") ) );
        System.out.println(listOfTitle);

        System.out.println("=====================================");

        //only keep the number 7,8,9
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1,-2,-7,-8));
        numbers.retainAll(Arrays.asList(7,8,9));
        //numbers.removeIf(p-> !(p==7 || p==8 || p==9));
        System.out.println(numbers);

        System.out.println("=====================================");

        //output will be less than 100
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,444,555,666,89,98,3));
        //I.yol ---- nums.removeIf(p-> p>100);
        //II.yol
        ArrayList<Integer> temp = new ArrayList<>();
        for (int each : nums){
            if (each<=100){
                temp.add(each);
            }
        }
        nums=temp;

        System.out.println(nums);


    }
}
