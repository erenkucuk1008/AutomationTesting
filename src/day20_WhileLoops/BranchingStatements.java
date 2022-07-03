package day20_WhileLoops;

public class BranchingStatements {

    public static void main(String[] args) {

        char ch='A';
        while (ch<= 'E'){
            if (ch=='C'){
                ch++;
                continue;
            }
            System.out.println(ch);
            ch++;
        }

        System.out.println();

        boolean a = true;
        while (a){
            System.out.println("Test Started");
            System.exit(0); // altta ki sout a gecmiyor. sistemden cikis yapiyor.
        }
        System.out.println("Completed");

    }
}
