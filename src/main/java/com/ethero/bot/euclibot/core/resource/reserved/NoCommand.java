package com.ethero.bot.euclibot.core.resource.reserved;

public class NoCommand implements ReservedCommand {
    String command;

    public NoCommand(String command) {
        this.command = command;
    }

    @Override
    public String getCommand() {
        return command;
    }

    @Override
    public void execute() {
        DataResource.voteNo++;
    }
}