package day05_ArithmeticOperators;

public class ConcatenationPractices {

    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetName = "johns Branch Dr";
        String cityName = "McLean";
        String state = "VA";
        int zipCode = 22000;

        System.out.println("I live at "+houseNumber+" house number on "+streetName+" , in "+cityName+", "+state);
        System.out.println("My zipcode is: "+zipCode);

        System.out.println("========================================================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileAge = 55000;
        double price = 22000;
        String color = "Red";

        System.out.println(year+" "+brand+" "+model+", "+mileAge+" miles, "+color+", $18000");

        System.out.println("========================================================");

        String firstName = "Eren";
        String lastName = "Kucuk";
        String fullName = firstName+" "+lastName;
        int age = 32;
        char gender = 'M';
        long phoneNumber = 8083494130L;
        int SSN = 2341234;

        System.out.println("Full name is: "+fullName);
        System.out.println("Age is: "+age+" years old");
        System.out.println("Gender is: "+gender);
        System.out.println("Phone number is: "+phoneNumber);
        System.out.println("SSN is: "+SSN);

    }
}
