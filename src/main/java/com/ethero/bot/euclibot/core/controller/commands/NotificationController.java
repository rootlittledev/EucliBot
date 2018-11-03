package com.ethero.bot.euclibot.core.controller.commands;

import com.ethero.bot.euclibot.core.model.commands.Notification;
import com.ethero.bot.euclibot.core.resource.commands.CommandDatabase;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/manage")
public class NotificationController {

    @RequestMapping(value = "notification/add", method = RequestMethod.POST)
    public void addNotificationCommand(@RequestBody Notification notification){

        CommandDatabase.notifications.put(notification.getCommandKey(), notification);
    }

    @RequestMapping(value = "notification/edit", method = RequestMethod.POST)
    public void editNotificationCommand(@RequestBody Notification notification){
        CommandDatabase.notifications.replace(notification.getCommandKey(), notification);
    }

    @RequestMapping(value = "notification/delete/{command}", method = RequestMethod.GET)
    public void deleteNotificationCommand(@PathVariable("command") String command){
        CommandDatabase.notifications.remove(command);
    }

    @RequestMapping(value = "notification/all", method = RequestMethod.GET)
    public List<Notification> deleteNotificationCommand(){
        List<Notification> notifications = new ArrayList<>();

        for (String key:CommandDatabase.notifications.keySet()) {
           notifications.add(CommandDatabase.notifications.get(key));
        }

        return notifications;
    }
}
