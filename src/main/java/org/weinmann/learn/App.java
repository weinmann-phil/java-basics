package org.weinmann.learn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        //Item fruit = new Item("Apple", 20);
        //Item weapon = new Item("Sword", 2);
        Fruit fruit = new Fruit("MacIntosh", "Apple", 20);
        Weapon weapon = new Weapon("Dagger", "Sword", 2, 75);

        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
        System.out.println("Hello World!");
    }
}
