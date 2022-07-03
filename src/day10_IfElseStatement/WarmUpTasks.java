package day10_IfElseStatement;

public class WarmUpTasks {

    public static void main(String[] args) {

        int angle1 = 60;
        int angle2 = 30;
        int angle3 = 80;
        int sum = angle1+angle2+angle3;
        boolean isValid  = sum == 180;

        if (isValid){
            System.out.println("This triangle is valid.");
        }else {
            System.out.println("This triangle is not valid");
        }

        System.out.println("============================");

        int num1 = 38;
        int num2 = 48;
        int num3 = 8;

        boolean num1Max = num1 > num2 && num1 > num3;
        boolean num2Max = num2 > num1 && num2 > num3;
        boolean num3Max = num3 > num1 && num3 > num2;

        boolean num1EqualNum2 = num1 == num2 && num1 != num3 && num2 != num3;
        boolean num1EqualNum3 = num1 == num3 && num1 != num2 && num2 != num3;
        boolean num2EqualNum3 = num2 == num3 && num1 != num2 && num1 != num3;
        boolean allNumberEqual = num1 == num2 && num1 == num2 && num2 == num3;

        boolean num1Min = num1 < num2 && num1 < num3;
        boolean num2Min = num2 < num1 && num2 < num3;
        boolean num3Min = num3 < num1 && num3 < num2;

        if (num1Max){
            System.out.println(num1+" is maximum");
        }if (num2Max){
            System.out.println(num2+" is maxium");
        }if (num3Max){
            System.out.println(num3+" is maxium");
        }if (num1Min){
            System.out.println(num1+" is minumum");
        }if (num2Min){
            System.out.println(num2+" is minumum");
        }if (num3Min){
            System.out.println(num3+" is minumum");
        }if (num1EqualNum2){
            System.out.println(num1+" is equal to "+num2);
        }if (num1EqualNum3){
            System.out.println(num1+" is equal to "+num3);
        }if (num2EqualNum3){
            System.out.println(num2+" is equal to "+num3);
        }if (allNumberEqual){
            System.out.println("All numbers are equal");
        }
    }
}
