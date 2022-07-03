package day24_Arrays;

public class UniqueCh {

    public static void main(String[] args) {

        String str = "aabccd";
        String result = "";

        for (int in = 0; in <= str.length() - 1; in++) {
            char ch = str.charAt(in);          // a a b c c d
            int first = str.indexOf(ch);      // 0 0 2 3 3 5
            int last = str.lastIndexOf(ch);   // 1 1 2 4 4 5

            if (first == last) {   // eger esitse unique demektir.
                result += ch;
            }
        }
        System.out.println(result);

        System.out.println("================================");

        for (int j = 0; j <= str.length() - 1; j++) {
            int frequency = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.print(str.charAt(j));
            }
        }
    }
}
