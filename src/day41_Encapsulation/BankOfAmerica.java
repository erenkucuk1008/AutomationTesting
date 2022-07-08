package day41_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Eren","Kucuk",12345);

        System.out.println(b1.getAccountHolder());
        System.out.println(b1.getBalance());

        b1.deposit(100);
        b1.availableBalance();

        System.out.println(b1.getBalance());
    }
}
