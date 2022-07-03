package day30_ReturnMethods;

public class ReturnMethods_2 {

    public static void main(String[] args) {

        String str1 = "ERENKUCUK";
        System.out.println(reverse(str1));
        String reversedName = reverse(str1);
        System.out.println(reversedName);

        boolean isPalindrome = str1.equalsIgnoreCase(reversedName);
        System.out.println(isPalindrome);

    }

    public static String reverse(String str){

        String result = "";

        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
