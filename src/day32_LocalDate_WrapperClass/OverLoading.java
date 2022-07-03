package day32_LocalDate_WrapperClass;

public class OverLoading {

    public static void main(String[] args) {
        System.out.println("String");
        int[] arr = {1,23,3};
        main(arr);
    }

    public static void main(int[] args) {
        System.out.println("integer");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }
}
