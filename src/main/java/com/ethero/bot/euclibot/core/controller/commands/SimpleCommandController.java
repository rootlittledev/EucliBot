package com.ethero.bot.euclibot.core.controller.commands;

import com.ethero.bot.euclibot.core.model.commands.SimpleCommand;
import com.ethero.bot.euclibot.core.resource.commands.CommandDatabase;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/manage")
public class SimpleCommandController {

    @RequestMapping(value = "simple/add", method = RequestMethod.POST)
    public void addSimpleCommand(@RequestBody SimpleCommand simpleCommand){

        CommandDatabase.simple.put(simpleCommand.getCommandName(), simpleCommand);
    }

    @RequestMapping(value = "simple/edit", method = RequestMethod.POST)
    public void editSimpleCommand(@RequestBody SimpleCommand simpleCommand){
        CommandDatabase.simple.replace(simpleCommand.getCommandName(), simpleCommand);
    }

    @RequestMapping(value = "simple/delete/{command}", method = RequestMethod.GET)
    public void deleteSimpleCommand(@PathVariable("command") String command){
        CommandDatabase.simple.remove(command);
    }

    @RequestMapping(value = "simple/all", method = RequestMethod.GET)
    public List<SimpleCommand> deleteSimpleCommand(){
        List<SimpleCommand> simple = new ArrayList<>();

        for (String key:CommandDatabase.simple.keySet()) {
            simple.add(CommandDatabase.simple.get(key));
        }

        return simple;
    }
}
