package com.litongjava.result;

public class OkResult<T> implements java.io.Serializable {
  private static final long serialVersionUID = -4806033278155820866L;
  private T v;
  private boolean ok = true;
  private Exception e;
  private String message;

  public OkResult(boolean b) {
    this.ok = b;
  }

  public OkResult(boolean b, T value) {
    this.ok = b;
    this.v = value;
  }

  public OkResult(boolean b, String message) {
    this.ok = b;
    this.message = message;
  }

  public OkResult(boolean b, Exception e) {
    this.ok = b;
    this.e = e;
    this.message = e.getMessage();
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

  public static <T> OkResult<T> ok(T value) {
    return new OkResult<T>(true, value);
  }

  public static <T> OkResult<T> fail(String value) {
    return new OkResult<T>(false, value);
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

  public OkResult() {
    super();
    // TODO Auto-generated constructor stub
  }

  public OkResult(T v, boolean ok, Exception e, String message) {
    super();
    this.v = v;
    this.ok = ok;
    this.e = e;
    this.message = message;
  }

  public T getV() {
    return v;
  }

  public void setV(T v) {
    this.v = v;
  }

  public boolean isOk() {
    return ok;
  }

  public void setOk(boolean ok) {
    this.ok = ok;
  }

  public Exception getE() {
    return e;
  }

  public void setE(Exception e) {
    this.e = e;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
