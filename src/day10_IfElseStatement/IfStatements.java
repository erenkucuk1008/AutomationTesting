package day10_IfElseStatement;

public class IfStatements {

    public static void main(String[] args) {

        int a = 44;
        int b = 54;
        int max = 0;

        if (a>b){
            max=a;
        }else {
            max=b;
        }
        System.out.println(max+" is maximum number");

        System.out.println("============================");

        int angle1=87;
        int angle2=78;
        int angle3=90;
        int angle4=105;
        boolean isValidRectangle = angle1==90 && angle2==90 && angle3==90 && angle4==90;

        if(isValidRectangle){
            System.out.println("This rectangle is valid");
        }else{
            System.out.println("This rectangle is not valid");
        }
    }
}
