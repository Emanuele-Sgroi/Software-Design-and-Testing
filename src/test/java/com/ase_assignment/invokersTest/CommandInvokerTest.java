package com.ase_assignment.invokersTest;

import com.ase_assignment.Employee;
import com.ase_assignment.Item;
import com.ase_assignment.StoreManagementSystemComp;
import com.ase_assignment.commands.AddItemToCartCommand;
import com.ase_assignment.commands.Command;
import com.ase_assignment.invokers.CommandInvoker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class CommandInvokerTest {
    private CommandInvoker invoker;

    @Mock
    private Command mockCommand;

    @BeforeEach
    void setUp() {
        StoreManagementSystemComp system = new StoreManagementSystemComp();
        Employee employee = new Employee("id", "Test User", "test@email.com");
        system.addEmployee(employee);
        Item item = new Item("item1", "Test Item", 10.0, true);
        Command addItemCommand = new AddItemToCartCommand(system, employee.getEmployeeID(), item);
        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(addItemCommand);
    }

    @Test
    void testExecuteCommand() {
        invoker.setCommand(mockCommand);
        invoker.executeCommand();
        verify(mockCommand, times(1)).execute();
    }

    @Test
    void testExecuteCommandWithNoCommandSet() {
        invoker.executeCommand();
        verify(mockCommand, never()).execute();
    }
}
