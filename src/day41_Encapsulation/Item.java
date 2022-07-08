package day41_Encapsulation;

public class Item {

    public String name;
    public double unitPrice, totalCost;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    public double calCost(){

        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calCost() +
                '}';
    }
}
