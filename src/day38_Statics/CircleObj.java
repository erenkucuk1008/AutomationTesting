package day38_Statics;

public class CircleObj {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.setInfo(4.44);
        System.out.println(c1);

        Circle c2 = new Circle();
        c2.setInfo(4.44);
        System.out.println(c2);

        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}
