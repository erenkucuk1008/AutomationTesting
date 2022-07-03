package day25_Practices;

public class FirstThreeCh {

    public static void main(String[] args) {

        String[] n = {"apple","banana","mango","watermelon"};

        for (String each : n){
            System.out.print(each.substring(0,3));
        }

        System.out.println();
        System.out.println("=============================");

        for (int i=0; i<=n.length-1; i++){
            System.out.print(n[i].substring(0,3));
        }
    }
}
