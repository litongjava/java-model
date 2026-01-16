package com.litongjava.model.error;

public class ErrorVo {
  private String message;
  private String type;
  private String param;
  private Integer code;

  public static ErrorVo fail(String type, String message) {
    return new ErrorVo(type, message);
  }

  public ErrorVo(String type, String message) {
    this.type = type;
    this.message = message;
  }

  public ErrorVo() {
    super();
    // TODO Auto-generated constructor stub
  }

  public ErrorVo(String message, String type, String param, Integer code) {
    super();
    this.message = message;
    this.type = type;
    this.param = param;
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }
}
