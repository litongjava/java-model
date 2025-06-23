package com.litongjava.aio;

public class StringPacket extends Packet {
  private static final long serialVersionUID = 151473584625935837L;
  private String body;

  public StringPacket(String body) {
    this.body = body;
  }

  public String getBody() {
    return body;
  }
}