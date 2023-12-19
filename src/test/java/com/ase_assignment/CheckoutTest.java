package com.ase_assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutTest {

    @Test
    void testSetGetCart() {
        Checkout checkout = new Checkout(100.0, false);
        Cart cart = new Cart(5);
        checkout.setCart(cart);
        assertEquals(cart, checkout.getCart());
    }

    @Test
    void testSetGetShippingInfo() {
        Checkout checkout = new Checkout(100.0, false);
        ShippingInfo shippingInfo = new ShippingInfo();
        checkout.setShippingInfo(shippingInfo);
        assertEquals(shippingInfo, checkout.getShippingInfo());
    }

    @Test
    void testSetGetBeenzCredit() {
        Checkout checkout = new Checkout(100.0, false);
        BeenzCredit beenzCredit = new BeenzCredit();
        checkout.setBeenzCredit(beenzCredit);
        assertEquals(beenzCredit, checkout.getBeenzCredit());
    }

    @Test
    void testSetGetPaymentSystem() {
        Checkout checkout = new Checkout(100.0, false);
        PaymentSystem paymentSystem = new PaymentSystem();
        checkout.setPaymentSystem(paymentSystem);
        assertEquals(paymentSystem, checkout.getPaymentSystem());
    }

    @Test
    void testSetGetEmployee() {
        Checkout checkout = new Checkout(100.0, false);
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        checkout.setEmployee(employee);
        assertEquals(employee, checkout.getEmployee());
    }

    @Test
    void testApplyBeenzCredits() {
        Checkout checkout = new Checkout(100.0, false);
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        checkout.setEmployee(employee);
        employee.setBeenzBalance(50);
        checkout.applyBeenzCredits(30);
        assertEquals(20, employee.getBeenzBalance(), 0.001);
        assertEquals(70, checkout.getTotalPrice(), 0.001);
    }
    //the following test is expected to fail
    @Test
    void testApplyBeenzCreditsFail() {
        Checkout checkout = new Checkout(100.0, false);
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        checkout.setEmployee(employee);
        employee.setBeenzBalance(50);
        checkout.applyBeenzCredits(30);
        assertEquals(20, employee.getBeenzBalance(), 0.001);
        assertEquals(70, checkout.getTotalPrice(), 0.001);
    }

    @Test
    void testConfirmOrder() {
        Checkout checkout = new Checkout(100.0, true);
        checkout.confirmOrder();
        assertTrue(checkout.isComplete());
    }

    @Test
    void testConfirmOrderFail() {
        Checkout checkout = new Checkout(100.0, true);
        checkout.confirmOrder();
        assertFalse(checkout.isComplete());
    }

    @Test
    void testCompleteCheckout() {
        Checkout checkout = new Checkout(100.0, true);
        checkout.setIsComplete(true);
        checkout.completeCheckout();
        assertTrue(checkout.isComplete());
    }
}

