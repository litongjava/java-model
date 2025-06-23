package com.litongjava.aio;

import java.nio.ByteBuffer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ByteBufferPacket extends Packet {
  private static final long serialVersionUID = 2333677428287067649L;
  private ByteBuffer byteBuffer;

  public void setByteBuffer(ByteBuffer byteBuffer) {
    this.byteBuffer = byteBuffer;
  }

  public ByteBuffer getByteBuffer() {
    return byteBuffer;
  }
}
