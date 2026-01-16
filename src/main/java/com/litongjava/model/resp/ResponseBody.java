package com.litongjava.model.resp;

public class ResponseBody implements java.io.Serializable {
  private static final long serialVersionUID = 407709012078889037L;
  private String code;
  private Object body;

  public ResponseBody() {
    super();
    // TODO Auto-generated constructor stub
  }

  public ResponseBody(String code, Object body) {
    super();
    this.code = code;
    this.body = body;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Object getBody() {
    return body;
  }

  public void setBody(Object body) {
    this.body = body;
  }
}
