package day25_Practices;

public class LongestString {

    public static void main(String[] args) {

        String[] words = {"Eren","Jeep Wrangler","Arzum"};

        int maxLength = words[0].length();
        int minLength = words[0].length();

        for (int i=0; i<=words.length-1; i++){
            if (maxLength<words[i].length()){
                maxLength=words[i].length();
            }
            if (minLength>words[i].length()){
                minLength=words[i].length();
            }
        }
        System.out.println("Max length is: "+maxLength);
        System.out.println("Min length is: "+minLength);

        for (int i=0; i<= words.length-1; i++){
            if (minLength==words[i].length()){
                System.out.println("Min length word is: "+words[i]);
            }
            if (maxLength==words[i].length()){
                System.out.println("Max length word is: "+words[i]);
            }
        }
    }
}
