package com.ase_assignment;

import java.util.HashMap;
import java.util.Map;

public class StoreManagementSystemComp implements StoreManagementSystem {
    private Map<String, Employee> employees = new HashMap<>();

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getEmployeeID(), employee);
    }
    @Override
    public Item getItem(String itemID) {
        // Implementation to get an Item
        return null;
    }
    @Override
    public void addItemToCart(String employeeID, Item item) {
        Employee employee = employees.get(employeeID);
        Cart cart = employee.getCart();
        if (employee != null && item != null && item.isAvailable()) {
            cart.addItem(item);
        } else {
            // Logic if item not available or employee not found
        }
    }
    @Override
    public Cart viewCart(String employeeID) {
        // Implementation to view cart
        return null;
    }
    @Override
    public void initiateCheckout(String employeeID, Item item, double totalPrice) {
        // Implementation to initiate checkout
    }
}
