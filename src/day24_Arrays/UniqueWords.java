package day24_Arrays;

public class UniqueWords {

    public static void main(String[] args) {

        String[] words = {"Java","C++","C#","Ruby","Java","Python","C++"};

        for (int i=0; i<= words.length-1; i++){
            int frequency = 0;
            for (int j=0; j<= words.length-1; j++){
                if (words[i]==words[j]){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.print(words[i]+" ");
            }
        }
    }
}
