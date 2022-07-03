package day29_CustomMethods;

public class Calculator {

    public static void main(String[] args) {

        calculator(6,4,'*');
        calculator(33,44,'-');
    }

    public static void calculator(int num1, int num2, char operator){

        if (operator == '+'){
            System.out.println(num1+num2);
        }else if (operator=='-'){
            System.out.println(num1-num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println(num1/num2);
        }
    }
}
