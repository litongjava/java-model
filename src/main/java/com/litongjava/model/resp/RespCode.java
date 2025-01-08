package com.litongjava.model.resp;

import java.util.Objects;

/**
 * @author tanyaowu
 * 2017年8月18日 下午3:56:02
 */
public enum RespCode {
  /**
   * 失败的响应
   */
  FAIL(0),

  /**
   * 成功的响应
   */
  OK(1),

  /**
   * 未知的响应
   */
  UNKNOWN(3);

  public static RespCode from(int value) {
    RespCode[] values = RespCode.values();
    for (RespCode v : values) {
      if (Objects.equals(v.value, value)) {
        return v;
      }
    }
    return null;
  }

  public int value;

  private RespCode(int value) {
    this.value = value;
  }
}
