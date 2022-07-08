package day41_Encapsulation;

public class LogIn {

    public static void main(String[] args) {

        Credentials c1 = new Credentials();

        System.out.println(c1.getUserName());
        System.out.println(c1.getPassword());

        c1.setUserName("Hello");
        System.out.println(c1.getUserName());
    }
}
