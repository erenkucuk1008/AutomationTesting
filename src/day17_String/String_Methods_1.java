package day17_String;

public class String_Methods_1 {

    public static void main(String[] args) {

        String str = "Eren Kucuk";
//                    0123456789   karakterler 0 dan baslar

        char str1 = str.charAt(1);
        System.out.println(str1); // 'r'

        int str2 = str.length();
        System.out.println(str2); // 10

        String str3 = str.toLowerCase();
        System.out.println(str3); // eren kucuk

        String str4 = str.toUpperCase();
        System.out.println(str4); // EREN KUCUK

        int lastIndexNumber = str.length() -1;// index 0 dan basladigi icin uzunlugun -1 i son index verir
        char lastChar = str.charAt(lastIndexNumber);
        System.out.println(lastChar);

        String firstName = "Eren";
        firstName = firstName.concat(" Kucuk");

        System.out.println(firstName);

        String school = "Cybertek".concat(" ".concat("School")); // Cybertek+" "+School daha kullanisli
        System.out.println(school);

        String word = "     Eren Kucuk     ";
        String newWord = word.trim(); // it removes white spaces at beginning and ending
        System.out.println(newWord);








    }
}
