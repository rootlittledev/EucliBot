package com.ethero.bot.euclibot.core.resource.commands;

import com.ethero.bot.euclibot.core.controller.Interaction;
import com.ethero.bot.euclibot.core.model.commands.PollCommand;
import com.ethero.bot.euclibot.core.resource.reserved.DataResource;

import java.util.Timer;
import java.util.TimerTask;


public class PollCommandExecutor implements Command {
    PollCommand pollCommand;
    Interaction interaction;

    public PollCommandExecutor(PollCommand pollCommand, Interaction interaction) {
        this.pollCommand = pollCommand;
        this.interaction = interaction;
    }

    @Override
    public void execute() {
        DataResource.voteNo = 0;
        DataResource.voteYes = 0;

        interaction.sendMessage(pollCommand.getVoteFor(), interaction.getChannel());

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                interaction.sendMessage(
                        DataResource.voteNo < DataResource.voteYes ? pollCommand.getSuccess() : pollCommand.getFailure(),
                        interaction.getChannel());
            }
        }, pollCommand.getDuration());
    }
}
