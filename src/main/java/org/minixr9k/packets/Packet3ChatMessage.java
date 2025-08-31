package org.minixr9k.packets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Packet3ChatMessage {

    public static void sendChat(String message, DataOutputStream out) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(3 + message.length() * 2)
                .order(ByteOrder.BIG_ENDIAN);
        buffer.put((byte) 0x03); // Packet ID
        buffer.putShort((short) message.length()); // Message Length
        for (char c : message.toCharArray()) {
            buffer.putChar(c); // Message in UTF-16BE
        }
        out.write(buffer.array());
        out.flush();
    }

}
