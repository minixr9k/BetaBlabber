package org.minixr9k.packets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Packet1Login {

    public static void sendLogin(String username, int protocolVersion, DataOutputStream out) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(19 + username.length() * 2)
                .order(ByteOrder.BIG_ENDIAN);
        buffer.put((byte) 0x01); // Packet ID
        buffer.putInt(protocolVersion); // Protocol version
        buffer.putShort((short) username.length()); // Name Length
        for (char c : username.toCharArray()) {
            buffer.putChar(c); // Name in UTF-16BE
        }
        buffer.putInt(0); // Map seed
        buffer.putInt(0); // Dimension
        out.write(buffer.array());
        out.flush();
    }

}
