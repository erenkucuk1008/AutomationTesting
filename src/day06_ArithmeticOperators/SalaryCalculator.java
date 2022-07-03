package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 140000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        //double salaryFacebook = 180000;
        //boolean facebook = true;

        System.out.println("Your salary is : "+ salary);
        System.out.println("Your state tax is : "+stateTax);
        System.out.println("Your federal tax is : "+federalTax);
        System.out.println("Your total tax is : "+totalTax);
        System.out.println("Your salary after tax is : "+salaryAfterTax);


    }
}
