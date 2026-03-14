package com.example.shoppinglist;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.List;

/**
 * Unit tests for Lesson 07 - UML Diagrams
 * These tests check that students correctly added:
 * 1. priority field to ShoppingItem
 * 2. getSortedByPriority() to ShoppingList
 */
public class ShoppingItemTest {

    private ShoppingItem item;
    private ShoppingList list;

    @Before
    public void setUp() {
        item = new ShoppingItem("Milk", 2);
        list = new ShoppingList("Test List");
    }

    // ===== PART 1: Basic functionality (should already work) =====

    @Test
    public void testShoppingItemCreation() {
        assertEquals("Milk", item.getName());
        assertEquals(2, item.getQuantity());
        assertFalse(item.isPurchased());
    }

    @Test
    public void testSetPurchased() {
        item.setPurchased(true);
        assertTrue(item.isPurchased());
    }

    @Test
    public void testShoppingListAddItem() {
        list.addItem(item);
        assertEquals(1, list.getTotalItems());
    }

    @Test
    public void testShoppingListGetItems() {
        list.addItem(item);
        List<ShoppingItem> items = list.getItems();
        assertNotNull(items);
        assertEquals(1, items.size());
    }

    // ===== PART 2: Student additions (priority field + getSortedByPriority) =====
    // TODO: Uncomment these tests after adding priority field and getSortedByPriority()

    /*
    @Test
    public void testPriorityField() {
        // Test that ShoppingItem has a priority field with getter and setter
        ShoppingItem highPriority = new ShoppingItem("Bread", 1);
        highPriority.setPriority(3);
        assertEquals(3, highPriority.getPriority());
    }

    @Test
    public void testDefaultPriority() {
        // Default priority should be 1
        ShoppingItem newItem = new ShoppingItem("Eggs", 6);
        assertEquals(1, newItem.getPriority());
    }

    @Test
    public void testGetSortedByPriority() {
        // Add items with different priorities
        ShoppingItem low = new ShoppingItem("Chips", 1);
        low.setPriority(1);
        ShoppingItem high = new ShoppingItem("Bread", 2);
        high.setPriority(3);
        ShoppingItem medium = new ShoppingItem("Milk", 1);
        medium.setPriority(2);

        list.addItem(low);
        list.addItem(high);
        list.addItem(medium);

        List<ShoppingItem> sorted = list.getSortedByPriority();
        assertNotNull(sorted);
        assertEquals(3, sorted.size());
        // Highest priority first
        assertEquals(3, sorted.get(0).getPriority());
        assertEquals(2, sorted.get(1).getPriority());
        assertEquals(1, sorted.get(2).getPriority());
    }
    */
}
