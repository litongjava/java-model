package com.litongjava.hook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HookCan {
  private static final Logger log = LoggerFactory.getLogger(HookCan.class);
  
  private static HookCan me = new HookCan();

  public static HookCan me() {
    return me;
  }

  private HookCan() {
  }

  /**
   * close时执行的方法
   */
  private List<Runnable> destroyMethods = new ArrayList<>();

  public void addDestroyMethod(Runnable task) {
    destroyMethods.add(task);
  }
  
  public List<Runnable> getDestroyMethods(){
    return destroyMethods;
  }

  public void clear() {
    destroyMethods.clear();
  }
  
  public void stop() {
    Iterator<Runnable> iterator = destroyMethods.iterator();
    while (iterator.hasNext()) {
      Runnable runnable = iterator.next();
      iterator.remove();
      try {
        runnable.run();
      } catch (Exception e) {
        log.error("error occured while :{}", runnable);
      }
    }
    me = new HookCan();
  }

  public void setDestroyMethods(List<Runnable> destroyMethods) {
    this.destroyMethods = destroyMethods;
  }
}
