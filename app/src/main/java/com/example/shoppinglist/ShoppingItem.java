package com.example.shoppinglist;

public class ShoppingItem {
    private String name;
    private int quantity;
    private boolean purchased;

    public ShoppingItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.purchased = false;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " (x" + quantity + ")" + (purchased ? " ✓" : "");
    }
}
