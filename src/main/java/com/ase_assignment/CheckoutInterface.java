package com.ase_assignment;

public interface CheckoutInterface {
    void applyBeenzCredits(double beenzAmount);
    double calculateTotal(double totalPrice);
    void confirmOrder();
    void checkout(String employeeID, Item item, double totalPrice);
}

