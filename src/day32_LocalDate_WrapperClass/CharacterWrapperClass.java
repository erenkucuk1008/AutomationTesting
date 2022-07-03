package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {

        char ch1 = 'w';
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));

        String str = "a1b2c3d4e5f6T@3w$%!_90;";
        String digits = "";
        String letters = "";
        String specialCharacters = "";

        for (char each : str.toCharArray()){
            if (Character.isDigit(each)){
                digits += each;
            }else if (Character.isLetter(each)){
                letters += each;
            }else {
                specialCharacters += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacters = " + specialCharacters);
    }
}
