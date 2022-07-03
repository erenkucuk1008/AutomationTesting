package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalaries {

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(40,67,8,20);
        SalaryCalculator salary2 = new SalaryCalculator(40,77,8,22);
        SalaryCalculator salary3 = new SalaryCalculator(45,37,8,23);
        SalaryCalculator salary4 = new SalaryCalculator(30,90,8,21);
        SalaryCalculator salary5 = new SalaryCalculator(50,27,8,22);

        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1,salary2,salary3,salary4,salary5));

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax = salaries.get(0).totalTax;

        for (SalaryCalculator each : salaries){
            if (each.salaryAfterTax > maxSalaryAfterTax){ // I. Yol.
                maxSalaryAfterTax = each.salaryAfterTax;
            }
            minSalaryAfterTax = Math.min(each.salaryAfterTax, minSalaryAfterTax); //II.Yol
            maxTotalTax = Math.max(each.totalTax, maxTotalTax);
            minTotalTax = Math.min(each.totalTax, minTotalTax);
        }

        System.out.println("minSalaryAfterTax = " + minSalaryAfterTax);
        System.out.println("maxSalaryAfterTax = " + maxSalaryAfterTax);

        System.out.println("minTotalTax = " + minTotalTax);
        System.out.println("maxTotalTax = " + maxTotalTax);

    }
}
