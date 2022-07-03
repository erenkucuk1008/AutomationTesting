package day20_WhileLoops;

public class WhileLoopPractice_2 {

    public static void main(String[] args) {

        int num = 10;

        while (num<15){

            System.out.println("Cybertek");

            num++;
        }

        System.out.println(num);

        System.out.println();

        String str = "Cybertek";
        String reverse = "";

        int index = str.length()-1;
        while (index>=0){
            reverse += str.charAt(index);
            index--;
        }
        System.out.println(reverse);
    }
}
