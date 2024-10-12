package com.litongjava.model.dsn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedisInfo implements java.io.Serializable {
  private static final long serialVersionUID = -4363506986864319285L;
  private String host;
  private Integer port;
  private String pswd;
}
