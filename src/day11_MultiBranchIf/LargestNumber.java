package day11_MultiBranchIf;

public class LargestNumber {

    public static void main(String[] args) {

        int n1=98;
        int n2=998;
        int n3=89;
        int max=0;

        if (n1>n2 && n1>n3){
            max=n1;
        }else if (n2>n1 && n2>n3){
            max=n2;
        }else {
            max=n3;
        }
        System.out.println("Largest number is: "+max);
    }
}
