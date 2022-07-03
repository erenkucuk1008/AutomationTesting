package day19_ForLoop;

public class Tasks {

    public static void main(String[] args) {

        for (int i=1 ; i<=100 ; i++){
            if (i%2!=0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

        for (int i=1 ; i<=100 ; i++){
            if (i%2==0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();

        int sumEven=0;
        for (int i=0 ; i<=100 ; i++){
            if (i%2==0){
                sumEven += i;
            }
        }
        System.out.println(sumEven);

        int sumOdd=0;
        for (int i=0 ; i<=100 ; i++){
            if (i%2!=0){
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
    }
}
