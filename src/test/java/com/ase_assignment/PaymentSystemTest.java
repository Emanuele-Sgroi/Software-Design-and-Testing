package com.ase_assignment;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentSystemTest {
    @Test
    void testSetGetCheckout() {
        PaymentSystem paymentSystem = new PaymentSystem();
        Checkout checkout = new Checkout(100.0, true);
        paymentSystem.setCheckout(checkout);
        assertEquals(checkout, paymentSystem.getCheckout());
    }

    @Test
    void testSetGetBeenzCredit() {
        PaymentSystem paymentSystem = new PaymentSystem();
        BeenzCredit beenzCredit = new BeenzCredit();
        paymentSystem.setBeenzCredit(beenzCredit);
        assertEquals(beenzCredit, paymentSystem.getBeenzCredit());
    }

    @Test
    void testSetGetEmployee() {
        PaymentSystem paymentSystem = new PaymentSystem();
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        paymentSystem.setEmployee(employee);
        assertEquals(employee, paymentSystem.getEmployee());
    }

    @Test
    void testFinishAndPay() {
        PaymentSystem paymentSystem = new PaymentSystem();
        Checkout checkout = new Checkout(100.0, true);
        Cart cart = new Cart(1);
        Item item = new Item("item1", "Item1", 10.0, true);
        cart.addItem(item);
        checkout.setCart(cart);
        paymentSystem.setCheckout(checkout);
        paymentSystem.finishAndPay(item, "id1", new Date());
        assertTrue(checkout.isComplete());
        assertEquals(0, cart.getItems().stream().mapToInt(Item::getQuantity).sum()); // Check if cart is empty
    }
    //the following test is expected to fail
    @Test
    void testFinishAndPayFail() {
        PaymentSystem paymentSystem = new PaymentSystem();
        Checkout checkout = new Checkout(100.0, true);
        Cart cart = new Cart(1);
        Item item = new Item("item1", "Item1", 10.0, true);
        cart.addItem(item);
        checkout.setCart(cart);
        paymentSystem.setCheckout(checkout);
        paymentSystem.finishAndPay(item, "id1", new Date());
        assertFalse(checkout.isComplete());
        assertEquals(0, cart.getItems().stream().mapToInt(Item::getQuantity).sum()); // Check if cart is empty
    }
}
