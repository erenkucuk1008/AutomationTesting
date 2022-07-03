package day39_StaticBlock;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian = true;
    public double totalPrice = 0;

    public void customInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        totalPrice += (width*length) * unitPrice;
        if (isPersian==true){
            totalPrice+=200;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=" + calcCost() +
                '}';
    }
}
