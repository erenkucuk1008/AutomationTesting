package day36_CustomClass;

public class Offer {

    public String location, jobTitle;
    public double salary;
    public boolean hasBenefit, WFH, hasPTO, isFullTime;

    public void setInfo(String location, String jobTitle, double salary, boolean hasBenefit,
                        boolean WFH, boolean hasPTO, boolean isFullTime){

        this.location = location;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public void getInfo(){
        System.out.println("Location: "+location+", Job Title: "+jobTitle+", Salary: "+salary+", Benefit: "+hasBenefit+
                ", Work From Home: "+WFH+", PTO: "+hasPTO+", Full Time: "+isFullTime);
    }
}

/*
Offer:
        Attributes
            Location, salary, jobTitle, hasBenifit(boolean), WFH(boolean), hasPTO(boolean), isFullTime
        Actions:
                setInfo
                getInfo
        MyOffers:
            create 7 objects of Offer class and store them into an ArrayList of Offer
            write a program that can only keep the offers from local area
            write a program that can remove all offers that are not for SDET or QA
            write a program that can remove all offers that are not work from home
            write a program that can remove all offers that does not have benefits
            write a program that can remove the offers that are not full Time
 */
