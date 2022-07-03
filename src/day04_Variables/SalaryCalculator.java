package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100000;
        double salaryAfterTax = salary - (salary * 0.28);
        System.out.println(salaryAfterTax);

        System.out.println();

        double tax = 0.28 * salary;
        double salaryAfterTax1 = salary - tax ;
        System.out.println(salaryAfterTax1);

        // tax hesaplayan kapsamli program yaz. Practice
    }
}
