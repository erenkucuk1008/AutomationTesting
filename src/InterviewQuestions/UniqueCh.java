package InterviewQuestions;

public class UniqueCh {

    public static void main(String[] args) {

        String str = "aabsddcgss";
        String unique = "";

        for (int j=0; j<str.length()-1; j++){
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i=0; i<str.length()-1; i++){
                if (ch==str.charAt(i)){
                    frequency++;
                }
            }
            if (frequency==1){
                unique += str.charAt(j);
            }
        }
        System.out.println(unique);
    }
}
