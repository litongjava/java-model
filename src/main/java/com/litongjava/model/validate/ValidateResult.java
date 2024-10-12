package com.litongjava.model.validate;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ValidateResult implements java.io.Serializable {
  private static final long serialVersionUID = 1154638717477163472L;
  private String field;
  private List<String> messages;

  public static List<ValidateResult> toList(String field, String message) {
    ValidateResult verifyResult = by(field, message);

    List<ValidateResult> verifyResults = new ArrayList<>();
    verifyResults.add(verifyResult);
    return verifyResults;
  }

  public static ValidateResult by(String field, String message) {
    List<String> messages = new ArrayList<>();
    messages.add(message);

    ValidateResult verifyResult = by(field, messages);
    return verifyResult;
  }

  public static ValidateResult by(String field, List<String> messages) {
    ValidateResult verifyResult = new ValidateResult(field, messages);
    return verifyResult;
  }
}
