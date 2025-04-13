package org.weinmann.learn;

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
}
