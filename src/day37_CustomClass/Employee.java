package day37_CustomClass;

public class Employee {

    public String name, company, jobTitle;
    public int weeklyHours;
    public double hourlyRate, salary, stateTaxRate, federalTaxRate, salaryAfterTax;

    public void setInfo(String name, String company, String jobTitle, int weeklyHours,double hourlyRate,double stateTaxRate, double federalTaxRate){
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.salary = calculateSalary();
        this.stateTaxRate = (stateTaxRate>1)? stateTaxRate/100 : stateTaxRate;
        this.federalTaxRate = (federalTaxRate>1)? federalTaxRate/100 : federalTaxRate;
        this.salaryAfterTax = calculateSalaryAfterTax();
    }

    public double calculateSalary(){
        return weeklyHours * hourlyRate * 52;
    }

    public double calculateStateTax(){
        return salary*stateTaxRate;
    }

    public double calculateFederalTax(){
        return salary*federalTaxRate;
    }

    public double calculateTax(){
        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax(){
        return salary - calculateTax();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
