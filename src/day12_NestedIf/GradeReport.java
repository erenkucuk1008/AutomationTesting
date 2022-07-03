package day12_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 50;
        String grade = "";

        if (score >= 0 && score <= 100) {
            grade = (score >= 90) ? "A" : (score >= 60) ? "B" : (score >= 45) ? "C" : "Fail";
        } else {
            System.out.println("Please give a correct score");
        }
        System.out.println(grade);
    }
}
