package day07_UnaryOperators;

public class Divisibility {

    public static void main(String[] args) {

        int number = 65;
        boolean isDivisibleTwo = number%2<1;
        boolean isDivisibleThree = number%3<1;
        boolean isDivisibleFive = number%5<1;

        System.out.println(number+" is divisible by 2: "+isDivisibleTwo);
        System.out.println(number+" is divisible by 3: "+isDivisibleThree);
        System.out.println(number+" is divisible by 5: "+isDivisibleFive);
    }
}
