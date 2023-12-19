package com.ase_assignment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    void testSetGetEmployee() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        Cart cart = new Cart(5);
        cart.setEmployee(employee);
        assertEquals(employee, cart.getEmployee());
    }

    @Test
    void testAddItem() {
        Cart cart = new Cart(5);
        Item item = new Item("item1", "Item1", 10.99, true);
        cart.addItem(item);
        assertTrue(cart.getItems().contains(item));
        assertEquals(cart, item.getCart()); // Verifying the back-reference from item to cart
    }

    @Test
    void testAddItemFail() {
        Cart cart = new Cart(5);
        Item item = new Item("item1", "Item1", 10.99, true);
        cart.addItem(item);
        assertFalse(cart.getItems().contains(item));
        assertEquals(cart, item.getCart()); // Verifying the back-reference from item to cart
    }

    @Test
    void testSetGetItems() {
        Cart cart = new Cart(5);
        Item item1 = new Item("item1", "Item1", 10.99, true);
        Item item2 = new Item("item2", "Item2", 20.99, true);
        List<Item> items = List.of(item1, item2);
        cart.setItems(items);
        assertEquals(items, cart.getItems());
    }

    @Test
    void testSetGetCheckout() {
        Cart cart = new Cart(8);
        Checkout checkout = new Checkout(100.99, true);
        cart.setCheckout(checkout);
        assertEquals(checkout, cart.getCheckout());
    }
}
