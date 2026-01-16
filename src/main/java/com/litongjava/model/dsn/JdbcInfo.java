package com.litongjava.model.dsn;

public class JdbcInfo implements java.io.Serializable {

  private static final long serialVersionUID = 458198790934789146L;

  // jdbc:postgresql://192.168.3.9/uh_courses
  private String url, user, pswd;

  /**
   * mysql,oracle,postgresql,sqlite
   * 
   * @return
   */
  public String getDbType() {
    return url.split(":")[1];
  }

  public JdbcInfo() {
    super();
    // TODO Auto-generated constructor stub
  }

  public JdbcInfo(String url, String user, String pswd) {
    super();
    this.url = url;
    this.user = user;
    this.pswd = pswd;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPswd() {
    return pswd;
  }

  public void setPswd(String pswd) {
    this.pswd = pswd;
  }
}
