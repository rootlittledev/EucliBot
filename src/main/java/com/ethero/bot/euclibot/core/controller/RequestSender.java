package com.ethero.bot.euclibot.core.controller;

import com.ethero.bot.euclibot.config.Config;
import com.ethero.bot.euclibot.core.model.commands.Notification;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class RequestSender {
    private HttpClient httpClient = HttpClientBuilder.create().build();

    public void notification(Notification notification) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        HttpPost request = new HttpPost("http://localhost:8091/notification/receive");
        StringEntity params =new StringEntity(mapper.writeValueAsString(notification));
        request.addHeader("content-type", "application/json");
        request.setEntity(params);
        httpClient.execute(request);
    }
}
