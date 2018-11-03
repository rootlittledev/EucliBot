package com.ethero.bot.euclibot.core.model.commands;

public class Notification {
    String commandKey;
    String text;
    String contentUrl;
    String soundUrl;
    String type;
    NotificationCss commandCss;

    int duration;

    public Notification() {
    }

    public Notification(String commandKey, String text, String contentUrl, String soundUrl, String type, NotificationCss commandCss, int duration) {
        this.commandKey = commandKey;
        this.text = text;
        this.contentUrl = contentUrl;
        this.soundUrl = soundUrl;
        this.type = type;
        this.commandCss = commandCss;
        this.duration = duration;
    }

    public String getCommandKey() {
        return commandKey;
    }

    public void setCommandKey(String commandKey) {
        this.commandKey = commandKey;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NotificationCss getCommandCss() {
        return commandCss;
    }

    public void setCommandCss(NotificationCss commandCss) {
        this.commandCss = commandCss;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
