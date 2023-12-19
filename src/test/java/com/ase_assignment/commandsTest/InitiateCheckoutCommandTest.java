package com.ase_assignment.commandsTest;

import com.ase_assignment.*;
import com.ase_assignment.commands.InitiateCheckoutCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InitiateCheckoutCommandTest {
    private StoreManagementSystemComp storeManagementSystem;
    private Employee employee;
    private Item item;
    private InitiateCheckoutCommand command;
    private Double totalPrice;

    @BeforeEach
    void setUp() {
        storeManagementSystem = new StoreManagementSystemComp();
        employee = new Employee("id1", "John", "john@example.com");
        item = new Item("item1", "Item1", 20.0, true);
        totalPrice = 20.0;
        storeManagementSystem.addEmployee(employee);
        employee.setCart(new Cart(1));
        command = new InitiateCheckoutCommand(storeManagementSystem, employee.getEmployeeID(), item, totalPrice);
    }

    @Test
    void execute() {
        command.execute();
        assertNotNull(employee.getCart().getItems());
    }
}
