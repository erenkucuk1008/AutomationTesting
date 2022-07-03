package day24_Arrays;

public class AverageNumber {

    public static void main(String[] args) {

        int [] arr = {10,15,5,6};
        int sum=0;

        for (int i=0; i<= arr.length-1; i++){
            sum += arr[i];
        }

        int averageNum = sum/(arr.length);

        System.out.println("Average number is: "+averageNum);

    }
}
