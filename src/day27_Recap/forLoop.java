package day27_Recap;

public class forLoop {

    public static void main(String[] args) {

        int[] scores = {10,20,30,40,50,60,70,80,90,100,110,99};
        int divisibleby3 = 0;
        for (int each : scores){
            if (each%3 != 0){
                continue;
            }
            divisibleby3++;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(divisibleby3);

        System.out.println("=====================================");

        String[] names = {"ABC","AB","A","ABCD","AB"};

        for (String each : names){
            if (! each.contains("C")){
                continue;
            }
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("====================================");

        int[] nums = {1,33,4,66,7,889,543};
        int max = nums[0];
        int min = nums[0];
        for (int each : nums){
            if(each>max) {
                max = each;
            }else if (each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("================================");

        String[] str = {"Java","C++","Python","Java","Java"};
        int countJava = 0;
        String str1 = "";
        for (String each : str){
            if (each.toLowerCase().contains("java")){
                System.out.print(each);
                countJava++;
                if (! str1.contains(each)){
                    str1 += each;
                }
            }
        }
        System.out.println();
        System.out.println(str1.toLowerCase());
        System.out.println(countJava);

    }
}
