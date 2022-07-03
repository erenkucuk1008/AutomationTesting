package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(200);
        list2.add(20);
        list2.add(300);
        list2.add(1000);
        list2.add(400);

        int max = list2.get(0);
        int min = list2.get(0);

        for (int each:list2){
            if (each>max){
                max=each;
            }else if (each<min){
                min=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
