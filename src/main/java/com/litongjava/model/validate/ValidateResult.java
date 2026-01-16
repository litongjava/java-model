package com.litongjava.model.validate;

import java.util.ArrayList;
import java.util.List;

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

  public ValidateResult() {
    super();
    // TODO Auto-generated constructor stub
  }

  public ValidateResult(String field, List<String> messages) {
    super();
    this.field = field;
    this.messages = messages;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }
}
