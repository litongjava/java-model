package com.litongjava.model.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBody implements java.io.Serializable {
  private static final long serialVersionUID = 407709012078889037L;
  private String code;
  private Object body;
}
