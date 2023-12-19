package com.ase_assignment.commandsTest;

import com.ase_assignment.*;
import com.ase_assignment.commands.AddItemToCartCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AddItemToCartCommandTest {
    private StoreManagementSystemComp system;
    private Employee employee;
    private Item item;
    private AddItemToCartCommand command;

    @BeforeEach
    void setUp() {
        system = new StoreManagementSystemComp();
        employee = new Employee("id1", "Emanuele", "test@example.com");
        item = new Item("item1", "Item1", 20.99, true);
        employee.setCart(new Cart(0));
        system.addEmployee(employee);
        command = new AddItemToCartCommand(system, employee.getEmployeeID(), item);
    }

    @Test
    void execute() {
        command.execute();
        assertTrue(employee.getCart().getItems().contains(item));
    }
}
