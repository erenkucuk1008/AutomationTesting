package day33_ArrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "a1b2c3d4e5";
        int sum = 0;

        for (char each : str.toCharArray()){
            if (Character.isDigit(each)){ // to verify if each character in String is digit
                sum += Integer.parseInt(""+each);// each digits need to be converted to integer
            }
        }
        System.out.println("sum = " + sum);
    }
}
