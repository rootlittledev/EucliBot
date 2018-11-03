package com.ethero.bot.euclibot.core.model.commands;

public class NotificationCss {
String textSize;
String textColor;
String textWidth;
String contentHeight;
String contentWidth;
String contentPositionH;
String contentPositionV;

    public NotificationCss() {
    }

    public NotificationCss(String textSize, String textColor, String textWidth, String contentHeight, String contentWidth, String contentPositionH, String contentPositionV) {
        this.textSize = textSize;
        this.textColor = textColor;
        this.textWidth = textWidth;
        this.contentHeight = contentHeight;
        this.contentWidth = contentWidth;
        this.contentPositionH = contentPositionH;
        this.contentPositionV = contentPositionV;
    }

    public String getTextSize() {
        return textSize;
    }

    public void setTextSize(String textSize) {
        this.textSize = textSize;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getTextWidth() {
        return textWidth;
    }

    public void setTextWidth(String textWidth) {
        this.textWidth = textWidth;
    }

    public String getContentHeight() {
        return contentHeight;
    }

    public void setContentHeight(String contentHeight) {
        this.contentHeight = contentHeight;
    }

    public String getContentWidth() {
        return contentWidth;
    }

    public void setContentWidth(String contentWidth) {
        this.contentWidth = contentWidth;
    }

    public String getContentPositionH() {
        return contentPositionH;
    }

    public void setContentPositionH(String contentPositionH) {
        this.contentPositionH = contentPositionH;
    }

    public String getContentPositionV() {
        return contentPositionV;
    }

    public void setContentPositionV(String contentPositionV) {
        this.contentPositionV = contentPositionV;
    }
}
