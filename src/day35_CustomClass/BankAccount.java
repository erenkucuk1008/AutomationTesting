package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public String accountNumber;
    public double availableBalance=0;

    public void setInfo(String accName, String accNumber){
        accountName = accName;
        accountNumber = accNumber;
    }

    public void getInfo(){
        System.out.println("================================================");
        System.out.println("The date is: "+ LocalDate.now());
        System.out.println("Your account name is: "+accountName);
        System.out.println("Your account number is: "+accountNumber);
        System.out.println("Your available balance is: "+availableBalance);
        System.out.println("================================================");
    }

    public void deposit(double amount){
        availableBalance += amount;
    }

    public void withdrawal(double amount){
        availableBalance -= amount;
    }

    public void showBalance(){
        System.out.println("Your available balance is: "+availableBalance);
    }
}
