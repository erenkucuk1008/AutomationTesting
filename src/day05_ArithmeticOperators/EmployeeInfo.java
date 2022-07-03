package day05_ArithmeticOperators;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Daniel";
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.println("Employee' full name is: "+firstName+" "+lastName);
        System.out.println(firstName+" "+lastName+"' gender is :"+gender);
        System.out.println(firstName+" "+lastName+"' age is :"+age+" years old");
        System.out.println(firstName+" "+lastName+"' works at :"+companyName);
        System.out.println(firstName+" "+lastName+"' job title is :"+jobTitle);
        System.out.println(firstName+" "+lastName+"' salary is :"+salary+" $");
        System.out.println(firstName+" "+lastName+" is full time employee :"+isFullTime);
        System.out.println(firstName+" "+lastName+"' is married :"+isMarried);
    }
}
