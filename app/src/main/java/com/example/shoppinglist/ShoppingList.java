package com.example.shoppinglist;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String listName;
    private List<ShoppingItem> items;

    public ShoppingList(String listName) {
        this.listName = listName;
        this.items = new ArrayList<>();
    }

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    public List<ShoppingItem> getItems() {
        return items;
    }

    public List<ShoppingItem> getPurchasedItems() {
        List<ShoppingItem> result = new ArrayList<>();
        for (ShoppingItem item : items) {
            if (item.isPurchased()) {
                result.add(item);
            }
        }
        return result;
    }

    public int getTotalItems() {
        return items.size();
    }

    public String getListName() {
        return listName;
    }
}
