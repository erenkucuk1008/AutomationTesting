package day29_CustomMethods;

public class UniqueArray {

    public static void main(String[] args) {

        String[] arr = {"A","A","B","C","C"}; // output B icin kod yazalim

        for (String each : arr){
            int count = 0;
            for (String a : arr){
                if (each.equals(a)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
