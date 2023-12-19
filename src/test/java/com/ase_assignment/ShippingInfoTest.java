package com.ase_assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingInfoTest {
    @Test
    void testSetGetEmployee() {
        ShippingInfo shippingInfo = new ShippingInfo();
        Employee employee = new Employee("id1", "Emanuele", "test@example.com");
        shippingInfo.setEmployee(employee);
        assertEquals(employee, shippingInfo.getEmployee());
    }
}
