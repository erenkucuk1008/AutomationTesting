package day34_ArrayList;

import java.util.ArrayList;

public class WarmUp {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // output 2 , 2 , 6 , 4 , 10

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        for (int i=0; i< list.size(); i++){
            int each = list.get(i);// unboxing
            if (each%2 != 0){
                list.set(i,each*2);
            }
        }
        System.out.println(list);
    }
}
