package day18_ForLoop;

public class ForLoop {

    public static void main(String[] args) {

        for (int i=1 ; i<=5 ; ++i){
            System.out.println("Hello World");
        }
        System.out.println("Done");

        System.out.println("=============================");

        for (int i=0 ; i<=100 ; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("===============================");

        for (int i=0 ; i<=100 ; i++){
            if (i%2!=0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("=============================");

        for (int i=100 ; i>=1 ; i--){
            System.out.print(i+" ");
        }
    }
}
