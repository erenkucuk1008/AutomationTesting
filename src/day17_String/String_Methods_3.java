package day17_String;

public class String_Methods_3 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1+" : "+str2);     // Java : Java         // EQUALS
        System.out.println(str1 == str2);        // false
        System.out.println(str1.equals(str2));   // true

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4);         // false
        System.out.println(str3.equals(str4));    // true

        String str5 = "JAVA";
        String str6 = "Java";
        System.out.println(str5.equals(str6)); // false
        System.out.println(str5.equalsIgnoreCase(str6)); // true
    }
}
