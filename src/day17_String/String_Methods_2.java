package day17_String;

public class String_Methods_2 {

    public static void main(String[] args) {

        String email = "erenkkucuk89@gmail.com";
        String word = email.replace("gmail","yahoo");

        System.out.println(word); // erenkkucuk89@yhoo.com
        System.out.println(email);// erenkkucuk89@gmail.com

        String str = "Java";
        str = str.replace("a","e");  //Jeve
        System.out.println(str);

        String sentence = "I started to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java","a, C#"); // a, den sonra ki Java --> C#
        System.out.println(sentence);

        sentence = sentence.replace("Java ","Python ");
        System.out.println(sentence);

        System.out.println("======================================");

        String s1 = "I like Java, I have best Java class";
        s1 = s1.replaceFirst("Java","Python"); //first "Java" will be changed to "Python"
        System.out.println(s1);

        String s2 = "I like watch movie, my favorite is Ezel";           //REPLACE
        s2 = s2.replace(", my favorite is Ezel","");     //REPLACEFIRST
        System.out.println(s2);

        System.out.println("=========================================");

        String s3 = "My name is Cybertek";
        int r1 = s3.indexOf("i");                              // INDEXOF
        System.out.println(r1);
        int r2 = s3.indexOf("be");
        System.out.println(r2);

        System.out.println("======================================");

        String s4 = "Java is a programming language, and Java is fun";
        int I1 = s4.indexOf("J");                                       //LASINDEXOF
        int I2 = s4.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        String name = "Eren";
        System.out.println(name.isEmpty());                             //ISEMPTY

        String str1 = "I like Java, Java is fun programming";
        System.out.println(str1.contains("Python")); // false           //CONTAINS
        System.out.println(str1.contains("Java"));  // true
        System.out.println(str1.contains("JAVA"));  //false
        System.out.println(!str1.contains("JAVA")); //true

        String str2 = "Muhtar";
        System.out.println(str2.startsWith("M"));  // true
        System.out.println(str2.startsWith("m"));  // false             //STARTSWITH


    }
}
