package com.litongjava.hook;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HookContainer {

  private static HookContainer me = new HookContainer();

  public static HookContainer me() {
    return me;
  }

  private HookContainer() {
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
}
