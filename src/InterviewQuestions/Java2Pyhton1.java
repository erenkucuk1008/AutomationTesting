package InterviewQuestions;

import java.util.Arrays;

public class Java2Pyhton1 {

    public static void main(String[] args) {

        String sentence = "I love Java, Python is cool, Javascript";
        String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));

        int countJava=0;
        int countPython=0;

        for (String each : word){
            if (each.toLowerCase().contains("java")){ // icinde Java gecenleri ariyorsak-- contains
                countJava++;                          // ama direk java kelimesi ariyorsak -- equals kullanmamiz gerekiyor.

            }else if (each.toLowerCase().contains("python")){
                countPython++;

            }
        }
        System.out.println("Java: "+countJava+" "+"Python: "+countPython);
    }
}
