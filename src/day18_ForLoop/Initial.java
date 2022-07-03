package day18_ForLoop;

public class Initial {

    public static void main(String[] args) {

        String firstName = "Eren";
        String lastName = "Kucuk";

        char initial1 = firstName.charAt(0);
        char initial2 = lastName.charAt(0);

        String initial3 = firstName.substring(0,1) + lastName.substring(0,1);

        System.out.println(initial1+""+initial2);
        System.out.println(initial3);
    }
}
