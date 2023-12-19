package com.ase_assignment.commands;

import com.ase_assignment.Item;
import com.ase_assignment.StoreManagementSystemComp;

public class InitiateCheckoutCommand implements Command{
    private StoreManagementSystemComp storeManagementSystem;
    private String employeeID;
    private Item item;
    private Double totalprice;
    public InitiateCheckoutCommand(StoreManagementSystemComp storeManagementSystem, String employeeID, Item item, Double totalprice){
        this.storeManagementSystem = storeManagementSystem;
        this.employeeID = employeeID;
        this.item = item;
        this.totalprice = totalprice;
    }
    @Override
    public void execute() {
        System.out.println("Initiate checkout command"); // for testing
        storeManagementSystem.initiateCheckout(employeeID, item, totalprice);
    }
}
