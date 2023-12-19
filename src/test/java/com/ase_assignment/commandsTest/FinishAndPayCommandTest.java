package com.ase_assignment.commandsTest;

import com.ase_assignment.*;
import com.ase_assignment.commands.FinishAndPayCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FinishAndPayCommandTest {
    private PaymentSystem paymentSystem;
    private Employee employee;
    private Cart cart;
    private Item item;
    private FinishAndPayCommand command;
    private Date date;

    @BeforeEach
    void setUp() {
        paymentSystem = new PaymentSystem();
        employee = new Employee("id1", "John", "john@example.com");
        cart = new Cart(1);
        item = new Item("item1", "Item1", 20.0, true);
        date = new Date();
        employee.setCart(cart);
        cart.addItem(item);
        paymentSystem.setCheckout(new Checkout(20.0, true));
        paymentSystem.getCheckout().setCart(cart);
        command = new FinishAndPayCommand(paymentSystem, item, employee.getEmployeeID(), date);
    }

    @Test
    void execute() {
        command.execute();
        assertTrue(paymentSystem.getCheckout().isComplete());
        assertEquals(1, paymentSystem.getCheckout().getCart().getItems().size());
    }
}
