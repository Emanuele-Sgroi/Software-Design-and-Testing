package com.ase_assignment;

import java.util.ArrayList;
import java.util.List;

public class Cart implements CartInterface {
    int quantity;
    //references
    private Employee employee;
    private List<Item> items = new ArrayList<>();
    private Checkout checkout;

    // Constructor
    public Cart(int quantity) {
        this.quantity = quantity;
    }

    // Establishing relationships (getter and setter)

    //Employee
    public void setEmployee (Employee employee){
        this.employee = employee;
    }
    public Employee getEmployee(){
        return this.employee;
    }

    //Item

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }
    public void addItem(Item item) {
        //OCL --> Cart items integrity invariant
        if (item != null) {
            items.add(item);
            item.setCart(this); // Set the cart reference in the item
        }
    }

    //Checkout
    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }
    public Checkout getCheckout() {
        return checkout;
    }

    @Override
    public void updateCart(int quantity) {
        System.out.print("updateCart() implementation");
    }

    @Override
    public Cart getCartContents(String employeeID) {
        return null;
    }

}
