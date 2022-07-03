package day37_CustomClass;

public class BankOfAmerica {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setInfo("Eren","Facebook","SDET",40,72,0.15,0.25);
        System.out.println(employee1);

        double totalTax = employee1.calculateTax();
        System.out.println("Total Tax: "+totalTax);

        double salaryAfterTax = employee1.calculateSalaryAfterTax();
        System.out.println(salaryAfterTax);

        Employee employee2 = new Employee();
        employee2.setInfo("Arzum","Google","QA",40,66,12,21);
        System.out.println(employee2);

        double totalTax2 = employee2.calculateTax();
        System.out.println("Total Tax: "+totalTax2);

        double salaryAfterTax2 = employee2.calculateSalaryAfterTax();
        System.out.println(salaryAfterTax2);
    }
}
