package day33_ArrayList;

public class PasswordRequirements {

    public static void main(String[] args) {

        String password = "Password#7";
        String upperLetter = "";
        String lowerLetter = "";
        String digit = "";
        String specialCh = "";

        for (char each: password.toCharArray()){
            if (Character.isUpperCase(each)){
                upperLetter += each;
            }else if (Character.isLowerCase(each)){
                lowerLetter += each;
            }else if (Character.isDigit(each)){
                digit += each;
            }else {
                specialCh += each;
            }
        }

        System.out.println("upperLetter = " + upperLetter);
        System.out.println("lowerLetter = " + lowerLetter);
        System.out.println("digit = " + digit);
        System.out.println("specialCh = " + specialCh);

        boolean isValid = password.length()>=8 && upperLetter.length()>0 &&
                lowerLetter.length()>0 && digit.length()>0 && specialCh.length()>0;

        if (isValid){
            System.out.println("Your password is true");
        }else {
            System.out.println("Try other password options");
        }
    }
}
