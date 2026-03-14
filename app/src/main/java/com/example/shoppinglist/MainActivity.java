package com.example.shoppinglist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ShoppingList shoppingList;
    private TextView listDisplay;
    private EditText itemNameInput;
    private EditText quantityInput;
    private Button addButton;
    private Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the shopping list
        shoppingList = new ShoppingList("My Shopping List");

        // Find UI elements
        listDisplay = findViewById(R.id.listDisplay);
        itemNameInput = findViewById(R.id.itemNameInput);
        quantityInput = findViewById(R.id.quantityInput);
        addButton = findViewById(R.id.addButton);
        clearButton = findViewById(R.id.clearButton);

        // Set up button listeners
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemToList();
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearList();
            }
        });

        // Display initial list
        updateListDisplay();
    }

    // TODO: Implement addItemToList() method
    // This method should:
    // 1. Get the item name from itemNameInput
    // 2. Get the quantity from quantityInput
    // 3. Create a new ShoppingItem
    // 4. Add it to shoppingList using addItem()
    // 5. Clear the input fields
    // 6. Call updateListDisplay()
    // Note: For now, priority is not needed. Later, you'll add it.
    private void addItemToList() {
        String itemName = itemNameInput.getText().toString().trim();
        String quantityStr = quantityInput.getText().toString().trim();

        if (itemName.isEmpty() || quantityStr.isEmpty()) {
            listDisplay.setText("Please enter both name and quantity");
            return;
        }

        try {
            int quantity = Integer.parseInt(quantityStr);
            if (quantity <= 0) {
                listDisplay.setText("Quantity must be greater than 0");
                return;
            }

            ShoppingItem newItem = new ShoppingItem(itemName, quantity);
            shoppingList.addItem(newItem);

            itemNameInput.setText("");
            quantityInput.setText("");

            updateListDisplay();
        } catch (NumberFormatException e) {
            listDisplay.setText("Please enter a valid quantity number");
        }
    }

    // TODO: Implement clearList() method
    // This method should:
    // 1. Create a new ShoppingList (clearing all items)
    // 2. Update the display
    private void clearList() {
        shoppingList = new ShoppingList("My Shopping List");
        itemNameInput.setText("");
        quantityInput.setText("");
        updateListDisplay();
    }

    // Helper method to update the ListView display
    private void updateListDisplay() {
        List<ShoppingItem> items = shoppingList.getItems();

        StringBuilder display = new StringBuilder();
        display.append("📋 ").append(shoppingList.getListName()).append("\n");
        display.append("Total items: ").append(shoppingList.getTotalItems()).append("\n");
        display.append("---\n");

        if (items.isEmpty()) {
            display.append("No items yet. Add one!");
        } else {
            for (ShoppingItem item : items) {
                display.append("• ").append(item.toString()).append("\n");
            }
        }

        listDisplay.setText(display.toString());
    }

    // TODO: Later in lesson 07, you will add:
    // - A priority field to ShoppingItem
    // - A getSortedByPriority() method to ShoppingList
    // - UI elements to set priority
    // - A button to sort items by priority
    // For now, focus on getting the basic add/remove functionality working!
}
