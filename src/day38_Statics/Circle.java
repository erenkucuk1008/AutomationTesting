package day38_Statics;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, perimeter;

    public void setInfo(double radius){
        this.radius = radius;
        this.diameter = 2*radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return radius*radius*Math.PI;
    }

    public double calculatePerimeter(){
        return diameter*Math.PI;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }

    public boolean equals(Circle circle){
        return this.radius == circle.radius;
    }
}
