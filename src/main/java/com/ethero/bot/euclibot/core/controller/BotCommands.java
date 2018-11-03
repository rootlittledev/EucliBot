package com.ethero.bot.euclibot.core.controller;

import com.ethero.bot.euclibot.core.model.commands.Notification;
import com.ethero.bot.euclibot.core.model.commands.PollCommand;
import com.ethero.bot.euclibot.core.model.commands.SimpleCommand;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("command")
public class BotCommands {

    @RequestMapping(value = "simple/add", method = RequestMethod.POST)
    public void addSimpleCommand(@RequestBody SimpleCommand simpleCommand){

    }

    @RequestMapping(value = "poll/add", method = RequestMethod.POST)
    public void addPollCommand(@RequestBody PollCommand pollCommand){

    }
    @RequestMapping(value = "notification/add", method = RequestMethod.POST)
    public void addNotificationCommand(@RequestBody Notification notification){

    }

    @RequestMapping(value = "/edit/{command}", method = RequestMethod.DELETE)
    public void deleteCommand(@PathVariable("command") String command){

    }
/*
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Map<String, CommandPattern> getAllCommands(){
        return CommandResource.commands;
    }*/
}
