package InterviewQuestions;

public class FrequencyOfCharacters_A4B2 {

    public static void main(String[] args) {

        String str = "AABBSDDAAZKML";
        String result = "";

        for (int j = 0; j <= str.length()-1; j++) {
            String ch = ""+str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                String eachCharacter =""+ str.charAt(i);
                if (ch.equals(eachCharacter)) {
                    count++;
                }
            }
            /*
            if (count>1){
               // result+=ch;
                if (!result.contains(""+ch)){
                    result+=""+ch;
                }
            }

             */
            if (!result.contains("" + ch)) {
                result += "" + ch + count;
            }
        }
        System.out.println(result);
    }
}
