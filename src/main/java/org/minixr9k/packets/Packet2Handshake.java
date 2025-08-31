package org.minixr9k.packets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Packet2Handshake {

    public static void sendHandshake(String username, DataOutputStream out) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(3 + username.length() * 2)
                .order(ByteOrder.BIG_ENDIAN);
        buffer.put((byte) 0x02); // Packet ID
        buffer.putShort((short) username.length()); // Name Length
        for (char c : username.toCharArray()) {
            buffer.putChar(c); // Name in UTF-16BE
        }
        out.write(buffer.array());
        out.flush();
    }
}
