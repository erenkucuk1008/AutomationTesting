package day24_Arrays;

public class UniqueWords2 {

    public static void main(String[] args) {

        String[] words = {"Java","C++","C#","Ruby","Java","Python","C++"};

        for (String each: words){
            int count=0;
            for (String b:words){
                if (each==b){
                    count++;
                }
            }
            if (count==1){
                System.out.print(each+" ");
            }
        }
    }
}
