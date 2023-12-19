package com.ase_assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreManagementSystemCompTest {
    private StoreManagementSystemComp system;
    private Employee employee;
    private Item item;
    private Checkout checkout;

    @BeforeEach
    void setUp() {
        system = new StoreManagementSystemComp();
        employee = new Employee("id1", "Emanuele", "test@example.com");
        Cart cart = new Cart(1);
        employee.setCart(cart);
        system.addEmployee(employee);

        item = new Item("item1", "Item1", 10.0, true);
    }

    @Test
    void testAddItemToCart() {
        system.addItemToCart(employee.getEmployeeID(), item);
        assertTrue(employee.getCart().getItems().contains(item));
    }

    @Test
    void testInitiateCheckout() {
        StoreManagementSystemComp system = new StoreManagementSystemComp();
        Employee employee = new Employee("empId", "Test", "test@example.com");
        Item item = new Item("item2", "Item2", 20.0, true);
        Checkout checkout = new Checkout(20.0, true);
        employee.setCart(new Cart(2));
        employee.getCart().setCheckout(checkout);
        system.addEmployee(employee);
        system.initiateCheckout(employee.getEmployeeID(), item, 20.0);
        assertEquals(20.0, checkout.getTotalPrice(), 0.001);
    }

    //the following test is expected to fail
    @Test
    void testInitiateCheckoutWrongPrice() {
        StoreManagementSystemComp system = new StoreManagementSystemComp();
        Employee employee = new Employee("empId", "Test", "test@example.com");
        Item item = new Item("item2", "Item2", 20.0, true);
        Checkout checkout = new Checkout(20.0, true);
        employee.setCart(new Cart(2));
        employee.getCart().setCheckout(checkout);
        system.addEmployee(employee);
        system.initiateCheckout(employee.getEmployeeID(), item, 20.0);
        assertEquals(30.0, checkout.getTotalPrice(), 0.001); // This assertion is expected to fail
    }

}
