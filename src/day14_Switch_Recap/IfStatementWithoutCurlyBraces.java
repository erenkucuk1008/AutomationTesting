package day14_Switch_Recap;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int a = 10;

        if (a>5) System.out.println(a+" is bigger than 5");
        else if (a==5) System.out.println(a+" is equal to 5");
        else System.out.println(a+" is smaller than 5");

        //we can use if statements without { }, but blocks can contain only 1 statement..
    }
}
