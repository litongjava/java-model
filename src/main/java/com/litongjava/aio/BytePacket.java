package com.litongjava.aio;

/**
 *
 * @author tanyaowu
 * 2017年4月1日 上午9:34:42
 */
public class BytePacket extends Packet {

  private static final long serialVersionUID = 1014364783783749718L;
  private byte[] bytes;

  public BytePacket(byte[] bytes) {
    this.bytes = bytes;
  }

  /**
   * @return the bytes
   */
  public byte[] getBytes() {
    return bytes;
  }

  /**
   * @param bytes the bytes to set
   */
  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }

}
