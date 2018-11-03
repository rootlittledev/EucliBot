package com.ethero.bot.euclibot.core.resource;

import java.util.Arrays;

public class SimpleCommandResource {

    private String[] arguments;

    public void parseArguments(String command){
        String[] message = command.split(" ");

        arguments = Arrays.copyOfRange(message, 1, message.length);
    }

    public String getMessage(String reply){
        return String.format(reply, arguments);
    }



}
