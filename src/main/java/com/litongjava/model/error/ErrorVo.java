package com.litongjava.model.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
