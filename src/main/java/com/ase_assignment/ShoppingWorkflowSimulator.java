package com.ase_assignment;

import com.ase_assignment.commands.AddItemToCartCommand;
import com.ase_assignment.commands.FinishAndPayCommand;
import com.ase_assignment.commands.InitiateCheckoutCommand;
import com.ase_assignment.commands.Command;
import com.ase_assignment.invokers.CommandInvoker;

import java.util.Date;

public class ShoppingWorkflowSimulator {
    public void simulateShoppingProcess() {
        // Objects for the commands
        StoreManagementSystemComp storeSystem = new StoreManagementSystemComp();
        Employee employee = new Employee("empID", "Emanuele Sgroi", "test@example.com");
        Item item = new Item("itemID", "Item Name", 20.99, true);
        // Simulate adding item to cart
        Command addItemCommand = new AddItemToCartCommand(storeSystem, employee.getEmployeeID(), item);
        CommandInvoker invoker = new CommandInvoker();
        invoker.setCommand(addItemCommand);
        invoker.executeCommand();
        // Simulate initiating checkout
        Command checkoutCommand = new InitiateCheckoutCommand(storeSystem, employee.getEmployeeID(), item, 20.0);
        invoker.setCommand(checkoutCommand);
        invoker.executeCommand();
        // Simulate finishing payment
        Command paymentCommand = new FinishAndPayCommand(new PaymentSystem(), item, employee.getEmployeeID(), new Date());
        invoker.setCommand(paymentCommand);
        invoker.executeCommand();
    }
    public static void main(String[] args) {
        System.out.print("Nunzio Emanuele Sgroi - 21508918 \n");
        System.out.print("-----\n");
        ShoppingWorkflowSimulator simulator = new ShoppingWorkflowSimulator();
        simulator.simulateShoppingProcess();
    }
}
