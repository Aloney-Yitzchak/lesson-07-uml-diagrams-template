package com.example.shoppinglist;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

public class ShoppingListTest {

    private ShoppingList shoppingList;

    @Before
    public void setUp() {
        shoppingList = new ShoppingList("Groceries");
    }

    @Test
    public void testListName() {
        assertEquals("Groceries", shoppingList.getListName());
    }

    @Test
    public void testEmptyList() {
        assertEquals(0, shoppingList.getTotalItems());
        assertTrue(shoppingList.getItems().isEmpty());
    }

    @Test
    public void testAddAndRemoveItem() {
        ShoppingItem item = new ShoppingItem("Milk", 1);
        shoppingList.addItem(item);
        assertEquals(1, shoppingList.getTotalItems());

        shoppingList.removeItem("Milk");
        assertEquals(0, shoppingList.getTotalItems());
    }

    @Test
    public void testGetPurchasedItems() {
        ShoppingItem item1 = new ShoppingItem("Bread", 1);
        ShoppingItem item2 = new ShoppingItem("Butter", 2);
        item1.setPurchased(true);

        shoppingList.addItem(item1);
        shoppingList.addItem(item2);

        List<ShoppingItem> purchased = shoppingList.getPurchasedItems();
        assertEquals(1, purchased.size());
        assertEquals("Bread", purchased.get(0).getName());
    }
}
