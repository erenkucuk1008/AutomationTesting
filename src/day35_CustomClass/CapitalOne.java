package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setInfo("Eren","123456789");
        b1.deposit(1500);
        b1.withdrawal(350);

        BankAccount b2 = new BankAccount();
        b2.setInfo("Arzum","2331234");
        b2.deposit(100000);

        BankAccount[] accounts = {b1,b2};
        for (BankAccount eachAcc : accounts){ // we can see all accounts
            eachAcc.getInfo();
        }

        System.out.println("*******************************************************");

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.addAll(Arrays.asList(accounts));

        accountList.removeIf(p-> p.availableBalance<50000); // it is the condition

        System.out.println("This account' balance is higher than $50.000");

        for (BankAccount each : accountList){
            each.getInfo();
        }
    }
}
