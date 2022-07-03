package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterList {

    public static void main(String[] args) {

        String str = "abcd!@#$%^1234(*&kfmd5";

        ArrayList<String> digit = new ArrayList<>(Arrays.asList(str.split("")));
        digit.removeIf(p-> !(Character.isDigit(p.charAt(0)) ) );
        System.out.println(digit);

        ArrayList<String> letter = new ArrayList<>(Arrays.asList(str.split("")));
        letter.removeIf(p-> !(Character.isLetter(p.charAt(0)) ) );
        System.out.println(letter);

        ArrayList<String> special = new ArrayList<>(Arrays.asList(str.split("")));
        special.removeIf(p-> Character.isLetterOrDigit(p.charAt(0)));
        System.out.println(special);

    }
}
