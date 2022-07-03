package day11_MultiBranchIf;

public class WarmupTask {

    public static void main(String[] args) {

        int grade = 100;
        String result ="";

        if (grade>=0 && grade<=100){
            if (grade>=90){
                result="Passed with distinction";
                //System.out.println("Passed with distinction");
            }else if (grade>=60 && grade<90){
                result="Pass";
                //System.out.println("Pass");
            }else {
                result="Fail";
                //System.out.println("Fail");
            }
            System.out.println(result);
        }else {
            System.out.println("Please give correct score");
        }

    }
}
