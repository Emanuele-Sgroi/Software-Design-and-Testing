package com.ase_assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {
    //the following test is expected to fail
    @Test
    public void testBeenzBalanceFail() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        employee.setBeenzBalance(100.01);
        assertEquals(100, employee.getBeenzBalance(), 0.001); // Delta is used for comparing doubles
    }
    @Test
    public void testBeenzBalance() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        employee.setBeenzBalance(100.00);
        assertEquals(100, employee.getBeenzBalance(), 0.001); // Delta is used for comparing doubles
    }
    @Test
    void testNegativeBeenzBalance() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        employee.setBeenzBalance(100);
        assertTrue(employee.getBeenzBalance() >= 0);
    }
    @Test
    void testEmailSetterGetter() {
        Employee employee = new Employee("id2", "Emanuele", "test@example.com");
        employee.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", employee.getEmail());
    }
    @Test
    void testIdSetterGetter() {
        Employee employee = new Employee("id3", "Emanuele", "test@example.com");
        employee.setEmployeeID("newId3");
        assertEquals("newId3", employee.getEmployeeID());
    }
    //the following test is expected to fail
    @Test
    void testIdSetterGetterFail() {
        Employee employee = new Employee("id3", "Emanuele", "test@example.com");
        employee.setEmployeeID("wrongID");
        assertEquals("newId3", employee.getEmployeeID());
    }
    @Test
    void testNameSetterGetter() {
        Employee employee = new Employee("id4", "Emanuele", "test@example.com");
        employee.setName("Nunzio");
        assertEquals("Nunzio", employee.getName());
    }
    @Test
    void testCartSetterGetter() {
        Employee employee = new Employee("id5", "Emanuele", "test@example.com");
        Cart cart = new Cart(2);
        employee.setCart(cart);
        assertEquals(cart, employee.getCart());
    }
    @Test
    void testItemSetterGetter() {
        Employee employee = new Employee("id6", "Emanuele", "test@example.com");
        Item item = new Item("item1", "Item1", 10.99, true);
        employee.setItem(item);
        assertEquals(item, employee.getItem());
    }
    @Test
    void testShippingInfoSetterGetter() {
        Employee employee = new Employee("id7", "Emanuele", "test@example.com");
        ShippingInfo shippingInfo = new ShippingInfo();
        employee.setShippingInfo(shippingInfo);
        assertEquals(shippingInfo, employee.getShippingInfo());
    }
    @Test
    void testBeenzCreditSetterGetter() {
        Employee employee = new Employee("id8", "Emanuele", "test@example.com");
        BeenzCredit beenzCredit = new BeenzCredit();
        employee.setBeenzCredit(beenzCredit);
        assertEquals(beenzCredit, employee.getBeenzCredit());
    }
}
