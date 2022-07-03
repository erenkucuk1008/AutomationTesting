package day28_Recap;

public class FrequencyOfWord_Array {

    public static void main(String[] args) {

        String[] arr = {"Java","C++","Python","java","JaVa"};
        String word = "java";

        int count = 0;

        for (String each : arr){
            if (!word.equalsIgnoreCase(each)){
                continue;
            }
            count++;
        }
        System.out.println(count);

        System.out.println("=======================================");

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
