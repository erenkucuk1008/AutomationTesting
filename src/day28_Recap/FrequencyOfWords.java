package day28_Recap;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String str = "javajavajava";
        //     str.substring(0,4) ==> java

        int count=0;
        for (int i=0; i<=str.length()-4; i++){//length()-4 yaziyoruz, java 4 harfli oldugu icin--EZBER
            String s = str.substring(i,i+4);
            if (s.equals("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
