package org.weinmann.learn;

public class Item {
    public String name;
    public int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "\"Name\":\"" + name + "\",\"Quantity\":" + quantity; 
    }
}
