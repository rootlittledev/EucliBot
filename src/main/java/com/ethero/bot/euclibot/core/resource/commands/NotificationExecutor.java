package com.ethero.bot.euclibot.core.resource.commands;

import com.ethero.bot.euclibot.core.controller.RequestSender;
import com.ethero.bot.euclibot.core.model.commands.Notification;

import java.io.IOException;

public class NotificationExecutor implements Command {
    Notification notification;
    String[] arguments;

    public NotificationExecutor(Notification notification, String[] arguments) {
        this.notification = notification;
        this.arguments = arguments;
    }

    @Override
    public void execute() {
        RequestSender requestSender = new RequestSender();
        try {
            System.out.println("Send");
            notification.setText(String.format(notification.getText(), arguments));
            requestSender.notification(notification );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
