package day23_Arrays;

public class TaskDuplicates {

    public static void main(String[] args) {

        String str = "AABBSDDAA";
        String nonDup = ""; // ABSD

        for (int i=0; i<=str.length()-1; i++){  // REMOVE DUPLICATES
            String s = ""+str.charAt(i);
            if (!(nonDup.contains(s))){
                nonDup += s;
            }
        }

        System.out.println(nonDup);

        String expectedResult = "";

        for (int j=0; j<=nonDup.length()-1; j++){
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i=0; i<=str.length()-1; i++){
                if (ch==str.charAt(i)){
                    count++;
                }
            }
            expectedResult += ""+ch+count;
        }
        System.out.println(expectedResult);
    }
}
