package com.ethero.bot.euclibot;

import com.ethero.bot.euclibot.core.controller.Interaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EucliBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(EucliBotApplication.class, args);

        Interaction bot = new Interaction();

        bot.connect();
        bot.joinChannel("forsen");
        bot.start();
    }
}
