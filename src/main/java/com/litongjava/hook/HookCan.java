package com.litongjava.hook;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HookCan {

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
}
