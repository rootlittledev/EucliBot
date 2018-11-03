package com.ethero.bot.euclibot.core.controller.commands;

import com.ethero.bot.euclibot.core.model.commands.PollCommand;
import com.ethero.bot.euclibot.core.resource.commands.CommandDatabase;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/manage")
public class PollCommandController {

    @RequestMapping(value = "poll/add", method = RequestMethod.POST)
    public void addPollCommand(@RequestBody PollCommand pollCommand){

        CommandDatabase.poll.put(pollCommand.getCommandKey(), pollCommand);
    }

    @RequestMapping(value = "poll/edit", method = RequestMethod.POST)
    public void editPollCommand(@RequestBody PollCommand pollCommand){
        CommandDatabase.poll.replace(pollCommand.getCommandKey(), pollCommand);
    }

    @RequestMapping(value = "poll/delete/{command}", method = RequestMethod.GET)
    public void deletePollCommand(@PathVariable("command") String command){
        CommandDatabase.poll.remove(command);
    }

    @RequestMapping(value = "poll/all", method = RequestMethod.GET)
    public List<PollCommand> deletePollCommand(){
        List<PollCommand> poll = new ArrayList<>();

        for (String key:CommandDatabase.poll.keySet()) {
            poll.add(CommandDatabase.poll.get(key));
        }

        return poll;
    }
}
