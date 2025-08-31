package org.minixr9k.packets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Packet13PlayerPositionLook {

    public static void sendPosition(double x, double y, double z, double stance, float yaw, float pitch, boolean onGround, DataOutputStream out) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(42) // 42 bytes
                .order(ByteOrder.BIG_ENDIAN);
        buffer.put((byte) 0x0D); // Packet ID
        buffer.putDouble(x); // X
        buffer.putDouble(y); // Y
        buffer.putDouble(stance); // Stance
        buffer.putDouble(z); // Z
        buffer.putFloat(yaw); // Yaw
        buffer.putFloat(pitch); // Pitch
        buffer.put((byte) (onGround ? 1 : 0)); // onGround
        out.write(buffer.array());
        out.flush();
    }

}
