package com.litongjava.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OkResult<T> implements java.io.Serializable {
  private static final long serialVersionUID = -4806033278155820866L;
  private T v;
  private boolean ok = true;
  private Exception e;

  public OkResult(boolean b) {
    this.ok = b;
  }

  public OkResult(boolean b, T value) {
    this.ok = b;
    this.v = value;
  }

  public OkResult(boolean b, Exception e) {
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
  public static OkResult fail() {
    return new OkResult(false);
  }

  @SuppressWarnings("rawtypes")
  public static OkResult exception(Exception e) {
    return new OkResult(false, e);
  }

  public static <T> OkResult<T> fail(T value) {
    return new OkResult<T>(false, value);
  }

  public static <T> OkResult<T> ok(T value) {
    return new OkResult<T>(true, value);
  }

  public OkResult<T> notOk() {
    this.ok = false;
    return this;
  }

  public OkResult<T> notOk(Exception e) {
    this.ok = false;
    this.e = e;
    return this;
  }

  public boolean isNotOk() {
    return this.ok == false;
  }

  public T getResult() {
    return v;
  }
}
