package org.minixr9k.bot;

import org.minixr9k.packets.Packet13PlayerPositionLook;
import org.minixr9k.packets.Packet1Login;
import org.minixr9k.packets.Packet2Handshake;
import org.minixr9k.packets.Packet3ChatMessage;

import java.io.*;
import java.net.*;

public class MinecraftBot {
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;

    public void start(String server, int port, String username, int protocolVersion) throws Exception {
        socket = new Socket(server, port);
        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());

        Packet2Handshake.sendHandshake(username, out); // 0x02 (Handshake)
        Packet1Login.sendLogin(username, protocolVersion, out); // 0x01 (Login)

        // Main loop for processing packets and sending position
        new Thread(() -> {
            try {
                while (!socket.isClosed()) {
                    handlePackets();
                    Packet13PlayerPositionLook.sendPosition(0, 64, 0, 60, 0.0f, 0.0f, true, out);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void sendMessage(String message) throws IOException {
        Packet3ChatMessage.sendChat(message, out); // 0x03 (ChatMessage)
    }


    private void handlePackets() throws IOException {
        while (in.available() > 0) {
            int packetId = in.readByte() & 0xFF;
            switch (packetId) {
                default:
                    // Unknown packets
                    while (in.available() > 0) {
                        in.readByte();
                    }
            }
        }
    }
}