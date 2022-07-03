package day25_Practices;

public class LongestString2 {

    public static void main(String[] args) {

        String[] words = {"Eren","Jeep Wrangler","Arm"};

        int maxLength = words[0].length();

        for (String each: words){            // to find max length
            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }


        for (String each: words){
            if (each.length() == maxLength){
                System.out.println(each);
            }
        }
    }
}
