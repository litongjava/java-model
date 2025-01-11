package com.litongjava.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OperateResult<T> implements java.io.Serializable {
  private static final long serialVersionUID = -4806033278155820866L;
  private T v;
  private boolean ok;
  private Exception e;

  public OperateResult(boolean b) {
    this.ok = b;
  }

  public OperateResult(boolean b, T value) {
    this.ok = b;
    this.v = value;
  }

  public OperateResult(boolean b, Exception e) {
    this.ok = b;
    this.e = e;
  }

  public Long getLong() {
    return v != null ? (Long) v : null;
  }

  public String getString() {
    return v != null ? (String) v : null;
  }

  public Integer getInteger() {
    return v != null ? (Integer) v : null;
  }

  @SuppressWarnings("rawtypes")
  public static OperateResult fail() {
    return new OperateResult(false);
  }

  @SuppressWarnings("rawtypes")
  public static OperateResult exception(Exception e) {
    return new OperateResult(false, e);
  }
  
  public static <T> OperateResult<T> fail(T value) {
    return new OperateResult<T>(false, value);
  }

  public static <T> OperateResult<T> ok(T value) {
    return new OperateResult<T>(true, value);
  }
}
