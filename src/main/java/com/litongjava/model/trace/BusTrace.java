package com.litongjava.model.trace;

public class BusTrace {
  private String userId;
  private Long requestId;
  private String traceId;
  private Long sessionId;
  private String sessionName;
  private Long dataId;
  private int taskId;
  private String taskName;
  private long startTime;

  public BusTrace() {
  }

  public BusTrace(String userId, Long requestId, String traceId, Long sessionId, String sessionName, Long dataId,
      int taskId, String taskName) {
    super();
    this.userId = userId;
    this.requestId = requestId;
    this.traceId = traceId;
    this.sessionId = sessionId;
    this.sessionName = sessionName;
    this.dataId = dataId;
    this.taskId = taskId;
    this.taskName = taskName;
  }

  public String getUserId() {
    return userId;
  }

  public BusTrace setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public Long getRequestId() {
    return requestId;
  }

  public BusTrace setRequestId(Long requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getTraceId() {
    return traceId;
  }

  public BusTrace setTraceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  public Long getSessionId() {
    return sessionId;
  }

  public BusTrace setSessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionName() {
    return sessionName;
  }

  public BusTrace setSessionName(String sessionName) {
    this.sessionName = sessionName;
    return this;
  }

  public Long getDataId() {
    return dataId;
  }

  public BusTrace setDataId(Long dataId) {
    this.dataId = dataId;
    return this;
  }

  public int getTaskId() {
    return taskId;
  }

  public BusTrace setTaskId(int taskId) {
    this.taskId = taskId;
    return this;
  }

  public String getTaskName() {
    return taskName;

  }

  public BusTrace setTaskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  public long getStartTime() {
    return startTime;
  }

  public BusTrace setStartTime(long startTime) {
    this.startTime = startTime;
    return this;
  }

}
