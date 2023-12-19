package com.ase_assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeenzCreditTest {
    @Test
    void testSetGetEmployee() {
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        BeenzCredit beenzCredit = new BeenzCredit();
        beenzCredit.setEmployee(employee);
        assertEquals(employee, beenzCredit.getEmployee());
    }
    @Test
    void testSetGetCheckout() {
        Checkout checkout = new Checkout(100.99, true);
        BeenzCredit beenzCredit = new BeenzCredit();
        beenzCredit.setCheckout(checkout);
        assertEquals(checkout, beenzCredit.getCheckout());
    }
    @Test
    void testSetGetPaymentSystem() {
        PaymentSystem paymentSystem = new PaymentSystem();
        BeenzCredit beenzCredit = new BeenzCredit();
        beenzCredit.setPaymentSystem(paymentSystem);
        assertEquals(paymentSystem, beenzCredit.getPaymentSystem());
    }
}
