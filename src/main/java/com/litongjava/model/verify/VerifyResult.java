package com.litongjava.model.verify;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyResult {
  private String field;
  private List<String> messages;

  public static List<VerifyResult> by(String field, String message) {
    List<String> messages = new ArrayList<>();
    messages.add(message);

    VerifyResult verifyResult = new VerifyResult(field, messages);

    List<VerifyResult> verifyResults = new ArrayList<>();
    verifyResults.add(verifyResult);
    return verifyResults;
  }
}
