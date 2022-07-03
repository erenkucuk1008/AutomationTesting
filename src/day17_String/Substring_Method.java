package day17_String;

public class Substring_Method {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789 10

        String word1 = sentence.substring(0,4);
        System.out.println(word1);
        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("==============================");

        String sntnce = "I like to watch movie";
        String word3 = sntnce.substring(10,14+1); // bitis indexinden +1 ekliyoruz
        System.out.println(word3);

        System.out.println("=============================");

        String firstName = "AbDurrAzZAk";
        String firstCh = firstName.substring(0,1);
        System.out.println(firstCh);

        String rest = firstName.substring(1,11); // kac harf oldugunu bilmedigimizde, cok uzun oldugunda
        System.out.println(rest);                 // length() metoduyla uzunlugunu bulup onu yazariz.

        String rest1 = firstName.substring(1,firstName.length());
        System.out.println(rest1);

        String rest2= firstName.substring(1);  // ya da sadece 1 ad index gireriz, basla ve sonuna kadar yaz demek
        System.out.println(rest2);

        firstName = firstCh.toUpperCase() + rest.toLowerCase();
        System.out.println(firstName);



    }
}
