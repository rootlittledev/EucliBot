package com.ethero.bot.euclibot.core.resource.reserved;

public class YesCommand implements ReservedCommand {
    String command;

    public YesCommand(String command) {
        this.command = command;
    }

    @Override
    public String getCommand() {
        return command;
    }

    @Override
    public void execute() {
        DataResource.voteYes++;
    }
}
