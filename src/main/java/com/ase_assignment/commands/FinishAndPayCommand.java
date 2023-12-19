package com.ase_assignment.commands;

import com.ase_assignment.PaymentSystem;
import com.ase_assignment.Item;

import java.util.Date;

public class FinishAndPayCommand implements Command {
    private PaymentSystem paymentSystem;
    private Item item;
    private String employeeID;
    private Date date;

    public FinishAndPayCommand(PaymentSystem paymentSystem, Item item, String employeeID, Date date) {
        this.paymentSystem = paymentSystem;
        this.item = item;
        this.employeeID = employeeID;
        this.date = date;
    }

    @Override
    public void execute() {
        System.out.println("Finish and pay command"); // for testing
        paymentSystem.finishAndPay(item, employeeID, date);
    }
}
