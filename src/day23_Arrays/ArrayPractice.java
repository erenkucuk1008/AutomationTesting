package day23_Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] friends = {"Mernus","Omer","Suleyman"};

        System.out.println(friends[1]);

        String name2 = friends[2];
        System.out.println(name2);

        System.out.println("==========================");

        int[] scores = {45,66,72,54,89};
        String[] names = {"Mike","Yedlin","Ivy","John","Xavier"};

        //System.out.println(names[0]+" : "+scores[0]);

        for (int i =0; i<=4; i++){
            System.out.println(names[i]+": "+scores[i]);
        }

        System.out.println("============================");

        String[] classmates = new String[5]; // size is 5
        classmates[0]="Hakan";
        classmates[1]="Sevgi";
        classmates[2]="Suleyman";
        classmates[3]="Arzum";
        classmates[4]="Eren";

        for (int i =0; i<= classmates.length-1; i++){
            System.out.println(classmates[i]);
        }
    }
}
