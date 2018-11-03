package com.ethero.bot.euclibot.core.resource;

import java.util.Arrays;

public class ArgumentResource {

    private String commandName;
    private String[] arguments;

    public void parseArguments(String command){
        if (command.contains("\"")){
            arguments[1] = command.subSequence(command.indexOf("\""), command.indexOf("\"", command.indexOf("\""))).toString();
        }


        String[] message = command.split(" ");

        commandName = message[0];

        if (command.contains("\"")){
            arguments[0] = command.subSequence(command.indexOf("\""), command.indexOf("\"", command.indexOf("\""))).toString();
            return;
        }

        arguments = Arrays.copyOfRange(message, 1, message.length);
    }

    public boolean hasArguments(){
        return arguments.length > 0;
    }

    public String getCommandName() {
        return commandName;
    }

    public String[] getArguments() {
        return arguments;
    }
}
