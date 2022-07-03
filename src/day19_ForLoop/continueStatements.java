package day19_ForLoop;

public class continueStatements {

    public static void main(String[] args) {

        for (int i=1 ; i<=5 ; i++){
            if (i==3){              // 3 u es gec
                continue;
            }
            System.out.print(i+" "); // 1 2 4 5
        }

        System.out.println();

        for (char ch='A' ; ch<='H' ; ch++){
            if (ch=='C' || ch=='G'){
                continue;
            }
            System.out.print(ch+" ");
        }

    }
}
