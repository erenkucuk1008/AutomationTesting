package InterviewQuestions;

public class Eren123_WithStar {

    public static void main(String[] args) {

        String str = "Eren123Arzum";
        String result = "";

        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                result += "*";
            }else{
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
