package com.ase_assignment.invokers;

import com.ase_assignment.commands.Command;

public class CommandInvoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        if (command != null) {
            command.execute();
        }
    }
}
