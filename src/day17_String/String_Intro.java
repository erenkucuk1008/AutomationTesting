package day17_String;

public class String_Intro {

    public static void main(String[] args) {

        String str1 = "Dog";
        String str2 = "Dog";

        String str3 = new String("Dog");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
    }
}
