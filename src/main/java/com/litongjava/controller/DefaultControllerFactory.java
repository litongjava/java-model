package com.litongjava.controller;

/**
 * @author tanyaowu
 *
 */
public class DefaultControllerFactory implements ControllerFactory {

  public static final DefaultControllerFactory me = new DefaultControllerFactory();

  /**
   * 
   */
  private DefaultControllerFactory() {
  }

  @Override
  public Object getInstance(Class<?> controllerClazz) throws Exception {
    return controllerClazz.newInstance();
  }
}
