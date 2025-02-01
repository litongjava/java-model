package com.litongjava.model.http.response;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import okhttp3.Headers;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseVo implements java.io.Serializable {
  private static final long serialVersionUID = 7720540152641412797L;

  private boolean ok;
  private int code;
  private Headers headers;
  private Map<String, String> headersMap;
  private byte[] bodyBytes;
  private String bodyString;
  private Object body;

  public ResponseVo(boolean ok) {
    this.ok = ok;
  }

  public ResponseVo(boolean ok, Headers headers) {
    this.ok = ok;
    this.headers = headers;
  }

  public ResponseVo(boolean ok, Headers headers, byte[] bytes) {
    this.ok = ok;
    this.headers = headers;
    this.bodyBytes = bytes;
  }

  public static ResponseVo ok(Headers headers, byte[] bodyBytes) {
    return new ResponseVo(true, headers, bodyBytes);
  }

  public ResponseVo(boolean ok, Headers headers, String bodyString) {
    this.ok = ok;
    this.headers = headers;
    this.bodyString = bodyString;
  }

  public ResponseVo(boolean ok, byte[] bodyBytes) {
    this.ok = ok;
    this.bodyBytes = bodyBytes;
  }

  public ResponseVo(boolean ok, String bodyBytes) {
    this.ok = ok;
    this.bodyString = bodyBytes;
  }

  public ResponseVo(boolean ok, Object result) {
    this.ok = ok;
    this.body = result;
  }

  public ResponseVo(boolean ok, int responseCode, byte[] bytes) {
    this.ok = ok;
    this.code = responseCode;
    this.bodyBytes = bytes;
  }

  public ResponseVo(boolean b, int responseCode, String bodyString) {
    this.ok = b;
    this.code = responseCode;
    this.bodyString = bodyString;
  }

  public static ResponseVo fail(Headers headers, byte[] bytes) {
    return new ResponseVo(false, headers, bytes);
  }

  public static ResponseVo ok(Headers headers, String bodyString) {
    return new ResponseVo(true, headers, bodyString);
  }

  public static ResponseVo fail(Headers headers, String bodyString) {
    return new ResponseVo(false, headers, bodyString);
  }

  public static ResponseVo ok(byte[] responseBody) {
    return new ResponseVo(true, responseBody);
  }

  public static ResponseVo ok(String responseBody) {
    return new ResponseVo(true, responseBody);
  }
  
  public static ResponseVo ok(Object result) {
    return new ResponseVo(true, result);
  }

  public static ResponseVo fail(byte[] bytes) {
    return new ResponseVo(false, bytes);
  }

  public static ResponseVo ok(int responseCode, byte[] bytes) {
    return new ResponseVo(true, responseCode, bytes);
  }

  public static ResponseVo fail(int responseCode, byte[] bytes) {
    return new ResponseVo(false, responseCode, bytes);
  }

  public static ResponseVo ok(int responseCode, String bodyString) {
    return new ResponseVo(true, responseCode, bodyString);
  }

  public static ResponseVo fail(int responseCode, String bodyString) {
    return new ResponseVo(false, responseCode, bodyString);
  }
}
