package com.litongjava.context;

import java.util.List;

public interface Context {

  public Context run(Class<?>[] primarySources, String[] args);

  public Context run(Class<?>[] primarySources, BootConfiguration tioBootConfiguration, String[] args);

  public void initAnnotation(List<Class<?>> scannedClasses);

  public boolean isRunning();

  public void close();

  public void restart(Class<?>[] primarySources, String[] args);

  public int getPort();


}
