package org.minixr9k;

import org.minixr9k.bot.MinecraftBot;

public class Main {

    public static final int protocolVersion = 14;

    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1";
        int port = 25565;

        String username = "BotName";

        MinecraftBot bot = new MinecraftBot();
        bot.start(host, port, username, protocolVersion);
        bot.sendMessage("Hello world!");
    }

}
