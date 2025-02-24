package com.litongjava.model.result;

import lombok.Data;

@Data
public class MultiResult<R1, R2, R3> {
  private int value;
  private boolean ok;
  private Exception e;
  private R1 r1;
  private R2 r2;
  private R3 r3;

  public MultiResult(boolean ok, R1 R1) {
    this.ok = ok;
    this.r1 = R1;
  }

  public MultiResult(boolean ok, R1 r1, R2 r2) {
    this.ok = ok;
    this.r1 = r1;
    this.r2 = r2;
  }

  public MultiResult(boolean ok, R1 r1, R2 r2, R3 r3) {
    this.ok = ok;
    this.r1 = r1;
    this.r2 = r2;
    this.r3 = r3;
  }
}
