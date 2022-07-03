package InterviewQuestions;

public class Palindrome_Arrays {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Eren"};
        int countOfPalindrome = 0;

        for (int j = 0; j < names.length; j++) {

            String original = names[j];
            String reverse = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }
            if (reverse.equalsIgnoreCase(original)) {
                countOfPalindrome++;
                System.out.println(original);
            }
        }


        System.out.println(countOfPalindrome);
    }
}
