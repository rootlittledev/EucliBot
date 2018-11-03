package com.ethero.bot.euclibot.core.controller;

import com.ethero.bot.euclibot.config.Config;
import com.ethero.bot.euclibot.core.model.Channel;
import com.ethero.bot.euclibot.core.model.User;
import com.ethero.bot.euclibot.core.model.commands.Notification;
import com.ethero.bot.euclibot.core.model.commands.PollCommand;
import com.ethero.bot.euclibot.core.model.commands.SimpleCommand;
import com.ethero.bot.euclibot.core.resource.ArgumentResource;
import com.ethero.bot.euclibot.core.resource.TwitchBot;
import com.ethero.bot.euclibot.core.resource.commands.*;
import com.ethero.bot.euclibot.core.resource.reserved.DataResource;
import com.ethero.bot.euclibot.core.resource.reserved.NoCommand;
import com.ethero.bot.euclibot.core.resource.reserved.YesCommand;


public class Interaction extends TwitchBot {

    private User user;
    private Channel channel;

    private ArgumentResource argumentResource = new ArgumentResource();



    public Interaction() {
        this.setUsername(Config.Username);
        this.setOauth_Key(Config.Oauth_Key);
        this.setClientID(Config.ClientID);

        DataResource.reservedCommands.put("yes", new YesCommand("yes"));
        DataResource.reservedCommands.put("no", new NoCommand("no"));

        CommandDatabase.simple.put("hi", new SimpleCommand("hi", "%s said hi to %s"));
        CommandDatabase.poll.put("enjoy", new PollCommand("enjoy", "Do you enjoy the stream?(!yes/!no", "As you see people enjoy your stream", "You are doing something wrong", 30000));
    }



    @Override
    protected void onCommand(User user, Channel channel, String command) {
        this.user = user;
        this.channel = channel;

        if (DataResource.reservedCommands.containsKey(command)) {
            DataResource.reservedCommands.get(command).execute();
            return;
        }

        Command commandExecutor;

        argumentResource.parseArguments(command);

        if (CommandDatabase.simple.containsKey(argumentResource.getCommandName()))
            commandExecutor = new SimpleCommandExecutor(CommandDatabase.simple.get(argumentResource.getCommandName()), this, argumentResource.getArguments());
        else if (CommandDatabase.poll.containsKey(argumentResource.getCommandName()))
            commandExecutor = new PollCommandExecutor(CommandDatabase.poll.get(argumentResource.getCommandName()), this);
        else if (CommandDatabase.notifications.containsKey(argumentResource.getCommandName()))
            commandExecutor = new NotificationExecutor(CommandDatabase.notifications.get(argumentResource.getCommandName()), argumentResource.getArguments());
        else
            commandExecutor = null;

        if (commandExecutor != null) {
            commandExecutor.execute();
        }


    }




    public User getUser() {
        return user;
    }

    public Channel getChannel() {
        return channel;
    }

}
