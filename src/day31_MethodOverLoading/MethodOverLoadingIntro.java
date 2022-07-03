package day31_MethodOverLoading;

import library.StringUtility;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        method();                //A
        method(4);            //B
        method(2,3);       //C
        method(1,"eren"); //D
        method(3.4);         //E
    }

    public static void method(){
        System.out.println("A");
    }

    public static void method(int a){
        System.out.println("B");
    }

    public static void method(int a, int b){
        System.out.println("C");
    }

    public static void method(int c, String str){
        System.out.println("D");
    }

    public static void method(double e){
        System.out.println("E");
    }
}
