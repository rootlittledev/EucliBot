package com.ethero.bot.euclibot.core.model.commands;


public class PollCommand {
    private String commandKey;
    private String voteFor;
    private String success;
    private String failure;

    private int duration;

    public PollCommand() {
    }

    public PollCommand(String commandKey, String voteFor, String success, String failure, int duration){
        this.commandKey = commandKey;
        this.voteFor = voteFor;
        this.success = success;
        this.failure = failure;

        this.duration = duration;
    }

    public String getCommandKey() {
        return commandKey;
    }

    public void setCommandKey(String commandKey) {
        this.commandKey = commandKey;
    }

    public String getVoteFor() {
        return voteFor;
    }

    public void setVoteFor(String voteFor) {
        this.voteFor = voteFor;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
