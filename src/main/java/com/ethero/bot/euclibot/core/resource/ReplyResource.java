package com.ethero.bot.euclibot.core.resource;

public class ReplyResource {
    private StringBuilder replyTemplate;

    public ReplyResource() {
        replyTemplate = new StringBuilder();
    }

    public void appendSlot(){
        replyTemplate.append(" %s ");
    }

    public void appendString(String string){
        replyTemplate.append(string);
    }

    public String build(){
        return replyTemplate.toString();
    }

    public static String getReply(Object[] params, String reply) {
        return System.out.format(reply, params).toString();
    }
}
