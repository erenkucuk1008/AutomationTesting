package day47_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        //Shape shape = new Shape("Shape");
        //Abstract class can not create objects

        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(4.5);

        System.out.println("Circle area: "+circle.area());
        System.out.println("Rectangle area: "+rectangle.area());
        System.out.println("Square area: "+square.area());
        System.out.println("==============================");
        System.out.println("Circle perimeter: "+circle.perimeter());
        System.out.println("Rectangle perimeter: "+rectangle.perimeter());
        System.out.println("Square perimeter: "+square.perimeter());

    }
}
