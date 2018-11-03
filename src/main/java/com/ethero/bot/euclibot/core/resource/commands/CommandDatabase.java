package com.ethero.bot.euclibot.core.resource.commands;

import com.ethero.bot.euclibot.core.model.commands.Notification;
import com.ethero.bot.euclibot.core.model.commands.PollCommand;
import com.ethero.bot.euclibot.core.model.commands.SimpleCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandDatabase {
    public static Map<String, Notification> notifications = new HashMap<>();
    public static Map<String, SimpleCommand> simple = new HashMap<>();
    public static Map<String, PollCommand> poll = new HashMap<>();
}
