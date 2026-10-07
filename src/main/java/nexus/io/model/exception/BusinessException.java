package nexus.io.model.exception;

/** An expected failure with an HTTP status, optional business code and client-safe message. */
public class BusinessException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  private final int status;
  private final String code;

  public BusinessException(int status, String message) {
    this(status, null, message, null);
  }

  public BusinessException(int status, String message, Throwable cause) {
    this(status, null, message, cause);
  }

  public BusinessException(int status, String code, String message) {
    this(status, code, message, null);
  }

  public BusinessException(int status, String code, String message, Throwable cause) {
    super(message, cause);
    if (status < 400 || status > 599) {
      throw new IllegalArgumentException("Business error status must be between 400 and 599");
    }
    this.status = status;
    this.code = code;
  }

  public int getStatus() {
    return status;
  }

  public String getCode() {
    return code;
  }

  public static void require(boolean condition, String message) {
    require(condition, 400, message);
  }

  public static void require(boolean condition, int status, String message) {
    if (!condition) {
      throw new BusinessException(status, message);
    }
  }

  public static void require(boolean condition, int status, String code, String message) {
    if (!condition) {
      throw new BusinessException(status, code, message);
    }
  }
}
