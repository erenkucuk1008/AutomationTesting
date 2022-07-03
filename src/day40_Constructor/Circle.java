package day40_Constructor;

public class Circle {

    public static double PI;

    static {
        PI = 3.14;
    }

    public double r, d, area, perimeter;

    public Circle(double r){
        this.r = r;
        d = 2 * r;
        area = r * r * PI;
        perimeter = d * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", d=" + d +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}

class CircleObjects{

    public static void main(String[] args) {

        Circle c1 = new Circle(5.5);
        System.out.println(c1.area);
        System.out.println(c1.perimeter);

        Circle c2 = new Circle(10);
        System.out.println(c2);
    }
}
