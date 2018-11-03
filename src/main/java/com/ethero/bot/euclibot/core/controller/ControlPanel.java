package com.ethero.bot.euclibot.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/panel")
public class ControlPanel {

    @RequestMapping(value = "/notification/open", method = RequestMethod.GET)
    public String openNotifications(Model model){
        return "notification";
    }

    @RequestMapping(value = "/simple/open", method = RequestMethod.GET)
    public String openSimpleCommands(Model model){
        return "simple";
    }

    @RequestMapping(value = "/poll/open", method = RequestMethod.GET)
    public String openPollCommands(Model model){
        return "poll";
    }
}
