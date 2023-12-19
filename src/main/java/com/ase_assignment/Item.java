package com.ase_assignment;

public class Item {
    private String itemID;
    private String name;
    private double price;
    public boolean isAvailable;
    //references
    private Employee employee;
    private Cart cart;

    // Constructor
    public Item(String itemID, String name, double price, boolean isAvailable) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Establishing relationships (getter and setter)

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Employee
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public Employee getEmployee(){
        return this.employee;
    }

    //Cart
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    public boolean isAvailable() {
        return true;
    }

    public void setQuantity(int quantity) {
    }

    public int getQuantity() {
        return 0;
    }
}
