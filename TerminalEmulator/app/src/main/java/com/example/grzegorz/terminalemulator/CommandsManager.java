package com.example.grzegorz.terminalemulator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by grzegorz on 09.05.15.
 */
public class CommandsManager {


    private List<Command> commands = new ArrayList<Command>();

    public CommandsManager() {
    }

    public void registerCommand(Command command){
        commands.add(command);
    }

    public String getAvailableCommands() {
        return commands.toString();
    }

    public Command getCommand(String name) {
        for (Command command : commands) {
            if (command.name.equals(name)) {
                return command;
            }
        }
        return null; //no command found
    }


}
