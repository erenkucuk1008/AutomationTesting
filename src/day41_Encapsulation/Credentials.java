package day41_Encapsulation;

public class Credentials {

    private String userName = "erenk";
    private double password = 12345;

    public String getUserName(){
        return userName;
    }

    public double getPassword(){
        return password;
    }

    public void setUserName(String userName){
        /*
        if (userName.length()<8){
            return;
        }
        we can also do security check in setter of Encapsulation

         */
        this.userName = userName;
    }

    public void setPassword(double password){
        this.password = password;
    }

}
