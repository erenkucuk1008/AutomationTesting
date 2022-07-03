package day18_ForLoop;

public class Reverse {

    public static void main(String[] args) {

        String word = "Python"; // ythonP

        String reverse =  word.substring(1) + word.substring(0,1) ;  // SUBSTRING METHOD ILE
        System.out.println(reverse);

        char ch1 = word.charAt(0);          // CHAR METOD ILE
        String str1 = word.substring(1);

        System.out.println(str1+ch1);

        
    }
}
