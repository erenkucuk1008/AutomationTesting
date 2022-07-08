package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Rice",4.99,10);
        Item item2 = new Item("Water",0.29,50);
        Item item3 = new Item("Chicken",9.89,2);
        Item item4 = new Item("Laptop",699,1);
        Item item5 = new Item("Coke",0.49,24);

        ArrayList<Item> shoppingList = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

        System.out.println(shoppingList);

        double total = 0;
        for (Item each : shoppingList){
            total+=each.calCost();
        }
        System.out.println("total = " + total);
    }
}
