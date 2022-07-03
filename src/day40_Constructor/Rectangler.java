package day40_Constructor;

public class Rectangler {

    public static int sideOfNumbers;
    public double width, length, area, perimeter;

    static {
        sideOfNumbers = 4;
    }

    public Rectangler(double width, double length) {
        this.width = width;
        this.length = length;
        area = width * length;
        perimeter = 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangler{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", side of numbers=" + sideOfNumbers +
                '}';
    }
}

class RectanglerObjects{

    public static void main(String[] args) {

        Rectangler r1 = new Rectangler(2.5, 4);
        System.out.println(r1);

        System.out.println(r1.sideOfNumbers);
    }
}
