package day10_IfElseStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1=67;
        int num2=60;
        int num3=77;
        boolean isNum1Max = num1>num2 && num1>num3;
        boolean isNum2Max = num2>num3 && num2>num1;
        boolean isNum3Max = !isNum1Max && !isNum2Max;
        //boolean isNum3Max = num3>num2 && num3>num1;
        int max=0;

        if (isNum1Max){
            max=num1;
        }if (isNum2Max){
            max=num2;
        }if (isNum3Max){
            max=num3;
        }
        System.out.println(max+" is maximum");

    }
}
