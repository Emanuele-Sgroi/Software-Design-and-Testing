package com.ase_assignment.commands;

import com.ase_assignment.StoreManagementSystemComp;
import com.ase_assignment.Item;

public class AddItemToCartCommand implements Command {
    private StoreManagementSystemComp storeManagementSystem;
    private String employeeID;
    private Item item;
    public AddItemToCartCommand(StoreManagementSystemComp storeManagementSystem, String employeeID, Item item) {
        this.storeManagementSystem = storeManagementSystem;
        this.employeeID = employeeID;
        this.item = item;
    }
    @Override
    public void execute() {
        System.out.println("Add item to cart command"); // for testing
        storeManagementSystem.addItemToCart(employeeID, item);
    }
}

