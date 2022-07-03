package day24_Arrays;

public class UniqueNumbers2 {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};

        for (int a:arr){
            int frequency = 0;
            for (int b:arr){
                if(a==b){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(a+" ");
            }
        }
    }
}
