package nexus.io.http.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import nexus.io.aio.Packet;

@SuppressWarnings("serial")
public abstract class HttpResponsePacket extends Packet {
  public abstract ByteBuffer toByteBuffer(ByteOrder byteOrder);
}