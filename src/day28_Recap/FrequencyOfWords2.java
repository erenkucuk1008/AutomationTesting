package day28_Recap;

public class FrequencyOfWords2 {

    public static void main(String[] args) {

        String str = "catcatdoganimalparakeetdog"; // cat - 3 harfli oldugu icin length()-3
        int count = 0;

        for (int i=0; i<=str.length()-3; i++){
            if (str.substring(i,i+3).equals("cat")){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("================================");

        String str11 = "catcatdoganimalparakeetdog"; // cat - 3 harfli oldugu icin length()-3
        int count11 = 0;

        while (str11.contains("cat")){
            count11++;
            str11 = str11.replaceFirst("cat","");
        }
        System.out.println(count11);
    }
}
