package com.ase_assignment;

public class Employee implements EmployeeInterface{
    private String employeeID;
    private String name;
    private String email;
    //references
    private Cart cart;
    private Item item;
    private ShippingInfo shippingInfo;
    private BeenzCredit beenzCredit;
    private double beenzBalance;


    //constructor
    public Employee(String employeeID, String name, String email) {
        this.employeeID = employeeID;
        this.name = name;
        this.email = email;
    }

    // Establishing relationships (getter and setter)
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    //Cart
    public void setCart(Cart cart){
        this.cart = cart;
    }
    public Cart getCart(){
        return this.cart;
    }

    //Item
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }

    //ShippingInfo
    public void setShippingInfo(ShippingInfo shippingInfo){
        this.shippingInfo = shippingInfo;
    }
    public ShippingInfo getShippingInfo(){
        return this.shippingInfo;
    }

    //BeenzCredit
    public void setBeenzCredit(BeenzCredit beenzCredit){
        this.beenzCredit = beenzCredit;
    }
    public BeenzCredit getBeenzCredit(){
        return this.beenzCredit;
    }

    @Override
    public double getBeenzBalance(){
        return this.beenzBalance;
    }

    public void setBeenzBalance(double beenzBalance) {
        //OCL --> ensure the Beenz balance is never negative
        if (beenzBalance >= 0) {
            this.beenzBalance = beenzBalance;
        } else {
            // Logic where the balance would be negative
        }
    }
}
