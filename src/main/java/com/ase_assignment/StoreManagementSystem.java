package com.ase_assignment;

public interface StoreManagementSystem {
    Item getItem(String itemID);
    void addItemToCart(String employeeID, Item item);
    Cart viewCart(String employeeID);
    void initiateCheckout(String employeeID, Item item, double totalPrice);
}

