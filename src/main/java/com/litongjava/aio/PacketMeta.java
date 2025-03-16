package com.litongjava.aio;

import java.util.concurrent.CountDownLatch;

public class PacketMeta implements java.io.Serializable {

  private static final long serialVersionUID = 6209036094326369490L;
  private Boolean isSentSuccess = false;
  private CountDownLatch countDownLatch = null;

  public Boolean getIsSentSuccess() {
    return isSentSuccess;
  }

  public void setIsSentSuccess(Boolean isSentSuccess) {
    this.isSentSuccess = isSentSuccess;
  }

  public CountDownLatch getCountDownLatch() {
    return countDownLatch;
  }

  public void setCountDownLatch(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

}
