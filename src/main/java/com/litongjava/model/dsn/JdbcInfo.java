package com.litongjava.model.dsn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JdbcInfo implements java.io.Serializable {

  private static final long serialVersionUID = 458198790934789146L;

  //jdbc:postgresql://192.168.3.9/uh_courses
  private String url, user, pswd;

  /**
   * mysql,oracle,postgresql,sqlite
   * @return
   */
  public String getDbType() {
    return url.split(":")[1];
  }
}
