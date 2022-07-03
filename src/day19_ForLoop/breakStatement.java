package day19_ForLoop;

public class breakStatement {

    public static void main(String[] args) {

        for (char ch='A' ; ch<='Z' ; ch++){
            if (ch=='H'){
                break;
            }
            System.out.print(ch+" ");     // A B C D E F G
        }

        System.out.println();

        for (int i=10 ; i<=50 ; i+=10){
            System.out.print(i+" ");     //10 20 30
            if (i==30){
                break;// if blogu sout un uzerinde olsaydi sout==>10 20 olur.30 a gelmeden break olur
            }
        }


    }
}
