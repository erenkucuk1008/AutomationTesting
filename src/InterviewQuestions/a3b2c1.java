package InterviewQuestions;

public class a3b2c1 {

    public static void main(String[] args) {

        String str = "aaabbc";

        String result="";

        for (String each : str.split("")){
            int count =0;
            for (String each2 : str.split("")){
                if (each.equals(each2)){
                    count++;
                }
            }
            if (!result.contains(each)){
                result+=each+count;
            }
        }
        System.out.println(result);
    }
}
