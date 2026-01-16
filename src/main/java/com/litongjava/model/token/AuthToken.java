package com.litongjava.model.token;

import java.io.Serializable;

/**
 * Token.
 */
public class AuthToken implements Serializable {

  private static final long serialVersionUID = -3667914001133777991L;

  private Object userId;
  private String token;
  // -1 表示永不过期
  private long expirationTime;

  /**
   * expirationTime 不予考虑, 因为就算 expirationTime 不同也认为是相同的 token.
   */
  public int hashCode() {
    return userId.hashCode();
  }

  public boolean equals(Object object) {
    if (object instanceof AuthToken) {
      return ((AuthToken) object).userId.equals(this.userId);
    }
    return false;
  }

  public AuthToken(Object userId, long expirationTime) {
    this.userId = userId;
    this.expirationTime = expirationTime;
  }

  public AuthToken() {
    super();
    // TODO Auto-generated constructor stub
  }

  public AuthToken(Object userId, String token, long expirationTime) {
    super();
    this.userId = userId;
    this.token = token;
    this.expirationTime = expirationTime;
  }

  public Object getUserId() {
    return userId;
  }

  public void setUserId(Object userId) {
    this.userId = userId;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public long getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
  }
}