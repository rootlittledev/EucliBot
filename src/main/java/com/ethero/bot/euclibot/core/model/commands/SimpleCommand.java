package com.ethero.bot.euclibot.core.model.commands;


public class SimpleCommand {
    String commandName;
    String reply;

    public SimpleCommand() {
    }

    public SimpleCommand(String commandName, String reply) {
        this.commandName = commandName;
        this.reply = reply;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getReply() {
        return reply;
    }

    public void setReplyResource(String reply) {
        this.reply = reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

}
