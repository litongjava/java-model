package com.litongjava.model.dsn;

public class RedisInfo implements java.io.Serializable {
  private static final long serialVersionUID = -4363506986864319285L;
  private String host;
  private Integer port;
  private String pswd;

  public RedisInfo() {
    super();
    // TODO Auto-generated constructor stub
  }

  public RedisInfo(String host, Integer port, String pswd) {
    super();
    this.host = host;
    this.port = port;
    this.pswd = pswd;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public String getPswd() {
    return pswd;
  }

  public void setPswd(String pswd) {
    this.pswd = pswd;
  }
}
