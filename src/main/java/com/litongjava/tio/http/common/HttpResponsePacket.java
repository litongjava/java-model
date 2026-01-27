package com.litongjava.tio.http.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.litongjava.aio.Packet;

@SuppressWarnings("serial")
public abstract class HttpResponsePacket extends Packet {
  public abstract ByteBuffer toByteBuffer(ByteOrder byteOrder);
}