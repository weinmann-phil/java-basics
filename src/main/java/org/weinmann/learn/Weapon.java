package org.weinmann.learn;

public class Weapon extends Item {
    private String type;
    private int damage;

    public Weapon(String type, String name, int quantity, int damage) {
        super(name, quantity);
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
