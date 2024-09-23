package com.litongjava.context;

public interface ServerListener {

  public void boforeStart(Class<?>[] primarySources, String[] args);

  public void afterStarted(Class<?>[] primarySources, String[] args, Context context);

  public void beforeStop();

  public void afterStoped();

}
