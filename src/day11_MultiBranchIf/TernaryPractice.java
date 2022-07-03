package day11_MultiBranchIf;

public class TernaryPractice {

    public static void main(String[] args) {

        int num=100;

        System.out.println(num%2==0 ? "Even" : "Odd");

        int num1 = 1097322673;
        System.out.println( (num1%19==0) ? num1+" Divisible by 19" : num1+" Not Divisible by 19");

        System.out.println("=======================================");

        int a =65;
        int b = 22;
        int max =0;
        int min=0;

        if (a>b){
            max=a;
        }else if (b>a){
            max=b;
        }else{
            System.out.println("Equal");
        }

        System.out.println("Max number is "+max);

        System.out.println(a>b ? a+" is maximum" : a<b ? b+" b is maximum" : "zero");

        System.out.println("================================");

        if (a<b){
            min=a;
        }else if (b<a){
            min=b;
        }else {
            System.out.println("Equal");
        }
        System.out.println("Min number is "+min);

        System.out.println(a<b ? a+" is minumum" : b<a ? b+" is minumum" : "zero");

        System.out.println("==================================");

        int number1=63;
        int number2=74;
        int number3=75;

        int maximum=0;
        int minumum=0;

        boolean number1Max = number1>number2 && number1>number3;
        boolean number2Max = number2>number1 && number2>number3;
        //boolean number3Max = !number1Max && !number2Max;

        if (number1Max){
            maximum = number1;
        }else if (number2Max){
            maximum=number2;
        }else {
            maximum=number3;
        }
        System.out.println("Maximum number is :"+ maximum);

        int max2 = number1Max ? number1 : number2Max ? number2 : number3;
        System.out.println("Max: "+max2);

        // ya da bu sekilde bi kerede yazariz
        System.out.println(number1Max ? "MaxT "+number1 : number2Max ? "MaxT "+number2 : "MaxT "+number3);

    }
}
