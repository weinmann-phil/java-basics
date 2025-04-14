package org.weinmann.learn.inventory;

public class Fruit extends Item {
    private String type;

    public Fruit(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /* @Override
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity;
    } */
    @Override
    public String toString() {
        return "\"Fruit\":\"" + type + "\",\"Name\":\"" + name + "\",\"Quantity\":" + quantity; 
    }

}
