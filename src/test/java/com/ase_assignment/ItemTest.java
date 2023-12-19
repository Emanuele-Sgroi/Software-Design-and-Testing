package com.ase_assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest {
    @Test
    void testConstructorAndGetters() {
        Item item = new Item("id1", "Item1", 20.99, true);
        assertEquals("id1", item.getItemID());
        assertEquals("Item1", item.getName());
        assertEquals(20.99, item.getPrice(), 0.001);
        assertTrue(item.isAvailable());
    }

    @Test
    void testSetGetEmployee() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        Item item = new Item("id1", "Item1", 20.99, true);
        item.setEmployee(employee);
        assertEquals(employee, item.getEmployee());
    }

    @Test
    void testSetGetCart() {
        Cart cart = new Cart(5);
        Item item = new Item("id1", "Item1", 20.99, true);
        item.setCart(cart);
        assertEquals(cart, item.getCart());
    }
}
