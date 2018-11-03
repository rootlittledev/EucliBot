package com.ethero.bot.euclibot.core.resource.commands;

import com.ethero.bot.euclibot.core.controller.Interaction;
import com.ethero.bot.euclibot.core.model.commands.SimpleCommand;

public class SimpleCommandExecutor implements Command {
    SimpleCommand simpleCommand;
    Interaction interaction;
    String arguments[];

    public SimpleCommandExecutor(SimpleCommand simpleCommand, Interaction interaction, String[] arguments) {
        this.simpleCommand = simpleCommand;
        this.interaction = interaction;
        this.arguments = arguments;
    }

    @Override
    public void execute() {
        System.out.println("Executing simple command");
        interaction.sendMessage(String.format(simpleCommand.getReply(), arguments), interaction.getChannel());
    }
}
